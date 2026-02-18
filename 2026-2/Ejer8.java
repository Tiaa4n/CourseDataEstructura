import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[30];

        for(int i=0;i<30;i++)
            A[i]=sc.nextInt();

        int mayor=A[0], menor=A[0];
        int contMayor=0, contMenor=0;

        for(int i=0;i<30;i++){
            if(A[i]>mayor) mayor=A[i];
            if(A[i]<menor) menor=A[i];
        }

        for(int i=0;i<30;i++){
            if(A[i]==mayor) contMayor++;
            if(A[i]==menor) contMenor++;
        }

        System.out.println("Mayor: "+mayor+" veces: "+contMayor);
        System.out.println("Menor: "+menor+" veces: "+contMenor);
    }
}
