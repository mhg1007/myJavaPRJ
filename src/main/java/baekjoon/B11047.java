package baekjoon;

import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int p=0;
        for (int i = N-1; i >=0 ; i--) {
            if(K/arr[i]!=0){
                p=p+K/arr[i];
                K=K%arr[i];
            }
        }
        System.out.print(p);
    }
}
