// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);
        Libro_Calificaciones miLibroCalificaciones = new Libro_Calificaciones();
        System.out.println("Escriba el nombre del curso: ");
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDeCurso(elNombre);
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();
    }
}