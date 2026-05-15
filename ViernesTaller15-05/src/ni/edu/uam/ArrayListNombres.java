package ni.edu.uam;

import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("María");

        estudiantes.remove("Luis");

        System.out.println("Lista actualizada de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
