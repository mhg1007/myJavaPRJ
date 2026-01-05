package baekjoon;

import java.util.Scanner;

public class B14648 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int qr=s.nextInt();
            if(qr==1){
                int a=s.nextInt();
                int b=s.nextInt();
                long sum=0;
                for (int j = a-1; j <= b-1; j++) {
                    sum+=arr[j];
                }
                System.out.println(sum);
                int tmp=arr[a-1];
                arr[a-1]=arr[b-1];
                arr[b-1]=tmp;
            }
            else{
                int a=s.nextInt();
                int b=s.nextInt();
                int c=s.nextInt();
                int d=s.nextInt();
                long sum1=0;
                for (int j = a-1; j <= b-1; j++) {
                    sum1+=arr[j];
                }
                long sum2=0;
                for (int j = c-1; j <= d-1; j++) {
                    sum2+=arr[j];
                }
                System.out.println(sum1-sum2);
            }
        }
    }
}
