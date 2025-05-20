package baekjoon;

import java.util.Scanner;

public class B1773 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int C=s.nextInt();
        int[] arr=new int[C+1];
        for (int i = 0; i < N; i++) {
            int prd=s.nextInt();
            for (int j = prd; j < C+1; j+=prd) {
                arr[j]+=1;
            }
        }
        int cnt=0;
        for(int a:arr){
            if (a>0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
