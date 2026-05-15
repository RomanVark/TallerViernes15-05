package ni.edu.uam;

import java.util.ArrayList;

public class ArrayListProductos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Pan");
        productos.add("Leche");
        productos.add("Arroz");
        productos.add("Azúcar");

        System.out.println("Productos registrados:");

        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Cantidad de productos registrados: " + productos.size());
    }
}
