package baekjoon;

import java.util.Scanner;

public class B9806 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int sq=s.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=(int)Math.pow(s.nextInt(),sq);
        }
        int sum=0;
        for(int a:arr){
            if(a>0){
                sum+=a;
            }
        }
        System.out.print(sum);
    }
}
