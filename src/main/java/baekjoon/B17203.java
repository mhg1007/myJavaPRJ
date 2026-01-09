package baekjoon;

import java.util.Scanner;

public class B17203 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q=s.nextInt();

        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int sgm=0;
            if(a!=b) {
                for (int j = b; j > a; j--) {
                    sgm += Math.abs(arr[j - 1] - arr[j - 2]);
                }
            }
            System.out.println(sgm);
        }
    }
}
