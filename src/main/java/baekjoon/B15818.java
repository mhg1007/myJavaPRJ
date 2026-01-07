package baekjoon;

import java.util.Scanner;

public class B15818 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        long mul=arr[0]%M;
        for (int i = 1; i < N; i++) {
            mul*=arr[i];
            mul%=M;
        }
        System.out.print(mul);
    }
}
