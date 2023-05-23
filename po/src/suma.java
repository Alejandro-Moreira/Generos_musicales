import java.util.Scanner;
//Ejercicio operaciones basicas
//Suma, resta y multiplicacion de 2 numeros
public class suma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int suma;
        int resta;
        int mult;
        System.out.print("Ingrese el primer numero: ");
        n1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = input.nextInt();
        suma = n1 + n2;
        System.out.printf("La suma es: %d%n", suma);
        resta = n1 - n2;
        System.out.printf("La resta es: %d%n", resta);
        mult = n1 * n2;
        System.out.printf("La multiplicacion es: %d%n", mult);
    }
}
