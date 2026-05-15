package ni.edu.uam.LinkedList;

import java.util.LinkedList;

public class LinkedListNombres {
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");

        nombres.addFirst("Pedro");
        nombres.addLast("María");

        System.out.println("Lista de nombres:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}