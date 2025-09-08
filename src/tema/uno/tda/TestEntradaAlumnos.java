package tema.uno.tda;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEntradaAlumnos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Alumno>alumnos=new ArrayList<>();
        Integer opcion=0;
        do{
            System.out.println("Opciones:");
            System.out.println("1:alta");
            System.out.println("5:mostrar Alumnos");
            System.out.println("6:salir");
            System.out.println("?");
            opcion=s.nextInt();
            //opciones
            switch (opcion){
                case 1:
                    //alta de alumno
                    System.out.println("nombre ?");
                    String nom=s.next();
                    System.out.println("edad ?");
                    byte edad=s.nextByte();
                    System.out.println("grupo ?");
                    int gpo=s.nextInt();
                    System.out.println("num Control?");
                    String NC=s.next();
                    alumnos.add(new Alumno(nom,edad,gpo,NC));
                    break;
                case 5:
                    System.out.println("alumnos");
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.println(alumnos.get(i));
                    }
                    break;
            }

        }while (opcion!=6);
    }
}
