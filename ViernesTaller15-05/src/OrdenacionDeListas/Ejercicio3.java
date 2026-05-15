package OrdenacionDeListas;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(90);
        numeros.add(15);
        numeros.add(40);
        numeros.add(7);
        numeros.add(60);

        // Orden descendente
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Lista descendente:");
        System.out.println(numeros);
    }
}