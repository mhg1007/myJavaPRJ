package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2693 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int[] arr=new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j]=s.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
