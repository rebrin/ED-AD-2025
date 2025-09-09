package tema.uno.tda.prestamos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

public class Sistema {
    //todo: busqueda por libro
    //todo: busqueda por cliente
    //las dos son tablas hash.
    Hashtable<String,Prestamo> PrestamosClientes=new Hashtable<>();

    public Sistema() throws ParseException {
        //clientes
        Cliente C1=new Cliente("jose","rubalcava","lopez","0123");
        Cliente C2=new Cliente("juan","rubalcava","lopez","1234");
        //libros
        Libro l1=new Libro("id1","el principito","rama");
        Libro l2=new Libro("id2","el mio cid","pearson");

        //hacemos un prestamo a jose
        ArrayList<Libro> lista=new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        prestar(C1,lista,2);
        //modificar la fecha para probar las multas
        Prestamo prestamoAnterior=PrestamosClientes.get(C1.getN_control());
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        prestamoAnterior.setFecha(format.parse("06/09/2025"));

        //verificar los prestamos
        System.out.println(PrestamosClientes.toString());

        //regreso el prestamo
        Prestamo p=PrestamosClientes.get(C1.getN_control());
        regresar(p);

        //verificar los prestamos
        System.out.println(PrestamosClientes.toString());//debe estar vacia
    }

    public void prestar(Cliente C,ArrayList<Libro> L,int dias){
        //solo se presta si no tiene prestamos.
        if(!PrestamosClientes.containsKey(C.getN_control()))
            PrestamosClientes.put(C.getN_control(),new Prestamo(C,new Date(),dias,L));
    }

    public void regresar(Prestamo p){
        //si el prestamo esta dentro de los dias eliminar el prestamo para este usuario
        Date fecha_actual=new Date();
        long dif=fecha_actual.getTime()-p.getFecha().getTime();
        long dias=TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        if(dias <= p.getTiempo()){
            //puedo regresar los libros sin problemas
            if(PrestamosClientes.containsKey(p.getCliente().getN_control())){
                PrestamosClientes.remove(p.getCliente().getN_control());
                System.out.println("prestamo terminado");
            }
        }else{
            //tengo que penalizar al usuario
            System.out.println("entrega penalizada y te cobro $10");
            PrestamosClientes.remove(p.getCliente().getN_control());
        }
    }

    //todo: crear el metodo modificar el prestamo (extender los dias del prestamo)
    //todo: crear el mostrar todos los prestamos
    //todo: crear el menu para CRUD.

    public static void main(String[] args) {
        try {
            new Sistema();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
