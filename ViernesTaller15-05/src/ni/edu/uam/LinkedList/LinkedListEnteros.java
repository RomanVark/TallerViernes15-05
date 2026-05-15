package ni.edu.uam.LinkedList;

import java.util.LinkedList;

public class LinkedListEnteros {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(15);
        numeros.add(30);
        numeros.add(45);
        numeros.add(60);
        numeros.add(75);

        System.out.println("Elementos del LinkedList:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}