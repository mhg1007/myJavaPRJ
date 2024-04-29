package baekjoon;

import java.util.Scanner;

public class B10813 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] Basket= new int[N];
        for (int I=0; I<N; I++){
            Basket[I]=I+1;
        }
        int k,l;
        for (int I=0; I<M; I++){
            int i=s.nextInt();
            int j=s.nextInt();
            k=Basket[i-1];
            l=Basket[j-1];
            Basket[i-1]=l;
            Basket[j-1]=k;
        }
        for (int I=0; I<N; I++){
            System.out.print(Basket[I]+" ");
        }
        s.close();
    }
}
