package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B20044 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr1=new int[n*2];
        for (int i = 0; i < n*2; i++) {
            arr1[i]=s.nextInt();
        }
        Arrays.sort(arr1);
        int[] arr2=new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i]=arr1[i]+arr1[n*2-1-i];
        }
        Arrays.sort(arr2);
        System.out.print(arr2[0]);
    }
}
