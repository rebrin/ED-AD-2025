package tema.uno.tda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("jose");
        nombres.add("rebrindanard");
        nombres.add("alejandro");
        nombres.add("alan");
        nombres.add("mayra");
        nombres.add("cristina");
        //metodo sort (ordenar bajo criterio, modifica la coleccion original)
        nombres.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(nombres.toString());
        System.out.println("-------------------------");
        ArrayList<Integer> enteros=new ArrayList<>();
        enteros.add(5);
        enteros.add(2);
        enteros.add(3);
        enteros.add(0);
        enteros.add(1);

        enteros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println(enteros.toString());
        System.out.println("-------------------------------");
        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(new Alumno("Maria",(byte)18,1,"iuasduiy"));
        alumnos.add(new Alumno("jose",(byte)30,2,"iuasduiy"));
        alumnos.add(new Alumno("Sabas",(byte)25,1,"4573sa"));
        alumnos.add(new Alumno("toño",(byte)17,3,"iuasduiy"));

        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        System.out.println(alumnos.toString());

        System.out.println("-------------------------");
        System.out.println("filtradas las del grupo 1");

        ArrayList<Alumno> alumnosPrimer=
                (ArrayList<Alumno>) alumnos.stream()
                        .filter(alumno -> alumno.edad <20)
                        .collect(Collectors.toList());
        System.out.println(alumnosPrimer.toString());

    }
}
