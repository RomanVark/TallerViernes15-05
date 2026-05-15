package ni.edu.uam;

import java.util.ArrayList;

class MiArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(25);
        numeros.add(30);
        numeros.add(45);
        numeros.add(60);

        System.out.println("Elementos del ArrayList:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
