import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Ingrese edades arreglo A:");
        for(int i=0;i<5;i++) a[i]=sc.nextInt();

        System.out.println("Ingrese edades arreglo B:");
        for(int i=0;i<5;i++) b[i]=sc.nextInt();

        int mayor = a[0];
        for(int i=0;i<5;i++){
            if(a[i]>mayor) mayor=a[i];
            if(b[i]>mayor) mayor=b[i];
        }

        System.out.println("El mayor es: " + mayor);
    }
}
