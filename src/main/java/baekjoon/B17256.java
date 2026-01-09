package baekjoon;

import java.util.Scanner;

public class B17256 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i]=s.nextInt();
        }
        System.out.print((arr[3]-arr[2])+" "+(arr[4]/arr[1])+" "+(arr[5]-arr[0]));
    }
}
