import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();

        System.out.print("Número a buscar: ");
        int x=sc.nextInt();
        int contador=0;

        for(int i=0;i<n;i++)
            if(A[i]==x) contador++;

        System.out.println("Se repite "+contador+" veces.");
    }
}
