import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        
        int suma = 0;
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + ": ");
            arreglo[i] = sc.nextInt();
            suma += arreglo[i];
        }
        
        System.out.println("La suma es: " + suma);
    }
}
