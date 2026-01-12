package baekjoon;

import java.util.Scanner;

public class B18311 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long k=s.nextLong();
        long[] a=new long[n];
        a[0]=s.nextInt();
        for (int i = 1; i < n; i++) {
            a[i]=s.nextInt()+a[i-1];
        }
        if(k>a[n-1]){
            k=a[n-1]*2-k;
        }
        int idx=0;
        for (int i = 0; i < n; i++) {
            if(k>=a[i]){
                idx++;
            }
            else{
                break;
            }
        }
        System.out.print(idx+1);
    }
}
