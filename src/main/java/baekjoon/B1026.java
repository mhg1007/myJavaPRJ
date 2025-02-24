package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1026 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr1=new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i]=s.nextInt();
        }
        int[] arr2=new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i]=s.nextInt();
        }
        int[] arr3=new int[N];
        System.arraycopy(arr2, 0, arr3, 0, N);
        Arrays.sort(arr1);
        Arrays.sort(arr3);
        int r=0;
        for (int i = 0; i < N; i++) {
            r+=arr1[i]*arr3[N-1-i];
        }
        System.out.print(r);
    }
}
