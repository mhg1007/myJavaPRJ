package baekjoon;

import java.util.Scanner;

public class B17504 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        long[] arr2=new long[2];
        arr2[0]=1;
        arr2[1]=arr[N-1];
        for (int i = N-2; i >=0 ; i--) {
            arr2[0]=arr2[0]+(arr[i]*arr2[1]);
            long tmp=arr2[0];
            arr2[0]=arr2[1];
            arr2[1]=tmp;
        }
        arr2[0]=arr2[1]-arr2[0];
        System.out.print(arr2[0]+" "+arr2[1]);
    }
}
