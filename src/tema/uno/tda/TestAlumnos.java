package tema.uno.tda;

import java.util.ArrayList;
import java.util.Iterator;

public class TestAlumnos {
    public static void main(String[] args) {
        /*Alumno [] alumnos=new Alumno[10];
        Alumno a1=new Alumno("jose", (byte)18,1,"4562sa");
        alumnos[0]=a1;
        alumnos[1]=new Alumno("maria",(byte)18,1,"iuasduiy");
        alumnos[2]=new Alumno("aaron",(byte)20,1,"4573sa");

        alumnos[3]=new Alumno("nose",(byte)30,1,"iuasduiy");
        alumnos[4]=new Alumno("sobas",(byte)25,1,"4573sa");
        alumnos[5]=new Alumno("tacos",(byte)17,1,"iuasduiy");

        //mostrar el contenido de alumnos
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
        */

        Alumno a1=new Alumno("jose",(byte)18,1,"1235456");
       /*//Alumno ref1=null;
        System.out.println(ref1);
        ref1.setNombre("Rebrin");
        ref1.setEdad((byte)42);
        ref1.setNControl("sin control");
        System.out.println(a1);*/

        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(new Alumno("maria",(byte)18,1,"iuasduiy"));
        alumnos.add(new Alumno("nose",(byte)30,1,"iuasduiy"));
        alumnos.add(new Alumno("sabas",(byte)25,1,"4573sa"));
        alumnos.add(new Alumno("tacos",(byte)17,1,"iuasduiy"));
        ArrayList<Alumno> clon=(ArrayList<Alumno>) alumnos.clone();
        //ArrayList<Alumno> clon=alumnos;
        Alumno refTacos=clon.getLast();
        refTacos.setNombre("Enchiladas");
        Alumno refmaria=clon.get(1);
        refmaria.setNombre("Lucia");
        clon.remove(3);

        ArrayList<Alumno> nuevos=new ArrayList<>();
        nuevos.add(new Alumno("nuevo",(byte)18,1,"0112"));
        nuevos.add(new Alumno("nuevo 2",(byte)19,1,"0564612"));
        alumnos.addAll(nuevos);

        //System.out.println(alumnos.toString());
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < clon.size(); i++) {
            System.out.println(clon.get(i));
        }

        System.out.println("---------------------------------");
        //clon.clear();
        System.out.println(clon.isEmpty()); //para saber si esta vacio
        System.out.println("---------------------------------");
        System.out.println("contiene a todos "+clon.containsAll(alumnos));
        System.out.println("---------------------------------");
        System.out.println("contiene el primero "+clon.contains(a1));
// buscar al alumno de nombre sabas
        Iterator<Alumno> it=alumnos.iterator();
        boolean esta_ahi=false;
        while(it.hasNext()){
            Alumno alias=it.next();
            if(alias.getNombre().equals("sabas")){
                esta_ahi=true;
                break;
            }
        }
        System.out.println("esta sabas "+esta_ahi);

        //eliminar el alumno nuevo
        /*for (int i = 0; i < alumnos.size(); i++) {
            Alumno alias=alumnos.get(i);
            if (alias.getNombre().equals("nuevo")){
                alumnos.remove(i);
            }
        }*/

        Iterator<Alumno> it2=alumnos.iterator();

        while(it2.hasNext()){
            Alumno alias=it2.next();
            if(alias.getNombre().equals("nuevo")){
                alumnos.remove(alias);
                break;
            }
        }
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }

    }




}
