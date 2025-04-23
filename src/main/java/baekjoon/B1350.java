package baekjoon;

import java.util.Scanner;

public class B1350 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int C=s.nextInt();
        long sum=0L;
        for(int a:arr){
            if(a!=0){
                sum+=C*(long)Math.ceil((double)a/C);
            }
        }
        System.out.print(sum);
    }
}
