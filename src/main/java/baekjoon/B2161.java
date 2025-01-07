package baekjoon;

import java.util.Scanner;

public class B2161 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < N-1; i++) {
            System.out.print(arr[0]+" ");
            int tmp=arr[1];
            for (int j = 0; j < N-2-i; j++) {
                arr[j]=arr[j+2];
            }
            arr[N-2-i]=tmp;
        }
        System.out.print(arr[0]);
    }
}
