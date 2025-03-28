package baekjoon;

import java.util.Scanner;

public class B3036 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 1; i < N; i++) {
            int p=arr[0];
            int q=arr[i];
            int r=0;
            for (int j = 1; j <= Math.max(p,q); j++) {
                if (p%j==0&&q%j==0){
                    r=j;
                }
            }
            int pp=p/r;
            int qq=q/r;

            if(i==N-1){
                System.out.print(pp+"/"+qq);
            }
            else {
                System.out.println(pp+"/"+qq);
            }
        }
    }
}
