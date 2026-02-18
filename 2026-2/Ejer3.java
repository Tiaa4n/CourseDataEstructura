import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        int sumaPares = 0, sumaImpares = 0;
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
            if (arreglo[i] % 2 == 0)
                sumaPares += arreglo[i];
            else
                sumaImpares += arreglo[i];
        }

        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares: " + sumaImpares);
    }
}
