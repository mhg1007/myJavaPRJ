package baekjoon;

import java.util.Scanner;

public class B14929 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        long sumsum=0;
        for (int i = 0; i < n-1; i++) {
            sum-=arr[i];
            sumsum+=arr[i]*sum;
        }
        System.out.print(sumsum);
    }
}
