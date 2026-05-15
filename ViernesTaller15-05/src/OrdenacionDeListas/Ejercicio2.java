package OrdenacionDeListas;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Mario");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Beatriz");

        // Orden alfabético
        Collections.sort(nombres);

        System.out.println("Nombres ordenados:");
        System.out.println(nombres);
    }
}