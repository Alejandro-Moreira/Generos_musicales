import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Genero Rock = new Genero("Rock", "120bpm", 1950, "EU", "Chuck Berry", "Festival de California");
        Genero Cumbia = new Genero("Cumbia", "80bpm", 1960, "Colombia", "Joe Arroyo", "Festival de Cali");
        Genero Salsa = new Genero("Salsa", "100bpm", 1970, "EU", "Willy Colon", "Festival de Viña del Mar");
        Genero Trap = new Genero("Trap", "100bpm", 2010, "Argentina", "Dillom", "Festival de Lolapaluza");
        Genero Rap = new Genero("Rap", "110bpm", 1970, "EU", "Eminem", "Festival de California");

        Rock.setAnio(1950);
        Trap.setAnio(2010);
        Cumbia.setAnio(1960);

        System.out.println(Rock.getAnio());
        System.out.println(Cumbia.getAnio());
        System.out.println(Trap.getAnio());

        System.out.println(Rock.getAnio() + Trap.getAnio() + Cumbia.getAnio());

        System.out.println("-------------------------------");
        System.out.println("Menu de Generos");
        Scanner entrada = new Scanner(System.in);
        String tipo, ritmo, pais, artista, festival;
        int anio;
        System.out.println("Ingrese el genero: ");
        tipo = entrada.nextLine();
        System.out.println("Ingrese el ritmo: ");
        ritmo = entrada.nextLine();
        System.out.println("Ingrese el pais: ");
        pais = entrada.nextLine();
        System.out.println("Ingrese el artista: ");
        artista = entrada.nextLine();
        System.out.println("Ingrese el festival: ");
        festival = entrada.nextLine();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();

        Trap.imprimirDatos();
    }
}
