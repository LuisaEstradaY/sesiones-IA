import java.util.Scanner;
import java.util.Arrays;

public class CalcularOrden {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = entrada.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = entrada.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int c = entrada.nextInt();

        int[] numeros = {a, b, c};
        Arrays.sort(numeros);

        System.out.println("\nResultados:");
        System.out.println("Menor: " + numeros[0]);
        System.out.println("Medio: " + numeros[1]);
        System.out.println("Mayor: " + numeros[2]);

        entrada.close();
    }
}