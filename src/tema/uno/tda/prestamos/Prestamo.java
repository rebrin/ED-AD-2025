package tema.uno.tda.prestamos;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private Cliente cliente;
    private Date fecha;
    private Integer tiempo;
    private ArrayList<Libro> libros;

    public Prestamo(Cliente cliente, Date fecha, Integer tiempo, ArrayList<Libro> libros) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.libros = libros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;


    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "cliente=" + cliente +
                ", fecha=" + fecha +
                ", tiempo=" + tiempo +
                ", libros=" + libros +
                '}';
    }
}
