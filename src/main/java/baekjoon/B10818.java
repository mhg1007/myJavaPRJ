package baekjoon;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A=new int[N];
        for (int i=0; i<N; i++) {
            A[i] = s.nextInt();
        }
        int min=A[0];
        int max=A[0];
        for (int i=1; i<N; i++){
            if(A[i]>max){
                max=A[i];
            }
            if(A[i]<min){
                min=A[i];
            }
        }
        System.out.print(min+" "+max);
        s.close();
    }
}
