package baekjoon;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int N=s.nextInt();
        int X=s.nextInt();

        int[] A=new int[N];

        for (int i=0; i<N; i++){
            int M=s.nextInt();
            A[i]=M;
            if(A[i]<X){
                System.out.print(A[i]+" ");
            }
        }
        s.close();
    }
}
