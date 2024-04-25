package baekjoon;

import java.util.Scanner;

public class B10810 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] Basket=new int[N];
        for (int I=0;I<M; I++){
            int i=s.nextInt();
            int j=s.nextInt();
            int k=s.nextInt();

            for (int J=i-1; J<j; J++){
                Basket[J]=k;
            }
        }
        for (int I=0;I<N;I++){
            System.out.print(Basket[I]+" ");
        }
    }
}
