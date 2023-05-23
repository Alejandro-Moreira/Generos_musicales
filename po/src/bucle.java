import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}

