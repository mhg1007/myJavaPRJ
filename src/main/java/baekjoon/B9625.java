package baekjoon;

import java.util.Scanner;

public class B9625 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,0};
        int K=s.nextInt();
        for (int i = 0; i < K; i++) {
            int a=arr[0];
            int b=arr[1];
            arr[1]=a+b;
            arr[0]=b;
        }
        System.out.print(arr[0]+" "+arr[1]);
    }
}
