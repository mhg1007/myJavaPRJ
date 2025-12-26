package baekjoon;

import java.util.Scanner;

public class B13458 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int B=s.nextInt();
        int C=s.nextInt();
        long sum=0;
        for(int a:arr){
            if(a<=B){
                sum+=1L;
            }
            else{
                sum+= (long)Math.ceil((a-B)/(double)C)+1L;
            }
        }
        System.out.print(sum);
    }
}
