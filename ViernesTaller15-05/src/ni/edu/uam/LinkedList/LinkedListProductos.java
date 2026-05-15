package ni.edu.uam.LinkedList;

import java.util.LinkedList;

public class LinkedListProductos {
    public static void main(String[] args) {
        LinkedList<String> productos = new LinkedList<>();

        productos.add("Pan");
        productos.add("Leche");
        productos.add("Queso");
        productos.add("Café");

        productos.remove("Queso");

        System.out.println("Lista de productos actualizada:");

        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}
