package OrdenacionDeListas;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros);

        System.out.println("Lista ordenada:");
        System.out.println(numeros);
    }
}