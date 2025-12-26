package baekjoon;

import java.util.Scanner;

public class B13300 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int[][] arr=new int[2][6];
        for (int i = 0; i < N; i++) {
            int S=s.nextInt();
            int Y=s.nextInt();
            arr[S][Y-1]+=1;
        }
        int sum=0;
        for(int[] a:arr){
            for(int b:a){
                sum+=(int)Math.ceil(b/(double)K);
            }
        }
        System.out.print(sum);
    }
}
