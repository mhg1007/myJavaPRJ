package baekjoon;

import java.util.Scanner;

public class B1940 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int mk=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i!=j){
                    if(arr[i]+arr[j]==M){
                        mk++;
                    }
                }
            }
        }
        System.out.print(mk/2);
    }
}
