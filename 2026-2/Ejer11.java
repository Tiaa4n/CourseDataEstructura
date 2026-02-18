import java.util.*;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> cero=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num<0) neg.add(num);
            else if(num==0) cero.add(num);
            else pos.add(num);
        }

        System.out.println("Negativos: "+neg);
        System.out.println("Ceros: "+cero);
        System.out.println("Positivos: "+pos);
    }
}
