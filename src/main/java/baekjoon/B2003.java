package baekjoon;

import java.util.Scanner;

public class B2003 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int chk=0;
        for (int i = 0; i < N; i++) {
            int sum=0;
            for (int j = i; j < N; j++) {
                sum+=arr[j];
                if(sum>=M){
                    if(sum==M)chk++;
                    break;
                }
            }
        }
        System.out.print(chk);
    }
}
