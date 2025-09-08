package tema.uno.tda;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        //listas
        ArrayList<String> lista_strings=new ArrayList<>();
        Vector<String> vector_strings=new Vector<>();
        lista_strings.add("hola");
        vector_strings.add("mundo");
        vector_strings.add("de");
        vector_strings.add("las ");
        vector_strings.add("las ");
        vector_strings.add("las ");
        vector_strings.add("estructuras de datos");
        System.out.println(vector_strings.toString());
        //set
        HashSet<String> set_strings=new HashSet<>();
        set_strings.add("A");
        set_strings.add("A");
        set_strings.add("A");
        set_strings.add("B");
        set_strings.add("B");
        set_strings.add("C");
        set_strings.add("C");
        set_strings.add("C");
        set_strings.add("C");
        System.out.println(set_strings.toString());//set elimina duplicados

        //Queue
        System.out.println("QUEUE");
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //poll (atiende) y peek (observar el inicio de la fila)
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.toString());

        //stack o pilas
        System.out.println("PILAS");
        Stack<Integer> pila=new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println(pila.toString());
        System.out.println(pila.pop());
        System.out.println(pila.toString());
        System.out.println(pila.peek());

        //HASH
        System.out.println("Hashes");
        Hashtable<Integer,String>Hash_nombres=new Hashtable<>();
        Hash_nombres.put(1,"rebrindanard");
        Hash_nombres.put(2,"jose");
        Hash_nombres.put(3,"morelos");
        Hash_nombres.put(4,"hidalgo");
        Hash_nombres.put(5,"chente");
        System.out.println(Hash_nombres.toString());
        System.out.println(Hash_nombres.get(5));
        Hash_nombres.put(5,"Vicente");
        System.out.println(Hash_nombres.toString());
        for(Integer i:Hash_nombres.keySet()){
            System.out.println("clave "+i);
        }
    }
}
