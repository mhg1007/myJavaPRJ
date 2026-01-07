package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B15969 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N-1]-arr[0]);
    }
}
