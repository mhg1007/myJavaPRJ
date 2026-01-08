package baekjoon;

import java.util.Scanner;

public class B17173 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] arr=new int[M];
        for (int i = 0; i < M; i++) {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for (int i = 1; i <=N ; i++) {
            for (int j = 0; j < M; j++) {
                if(i%arr[j]==0){
                    sum+=i;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
