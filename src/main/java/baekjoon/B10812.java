package baekjoon;

import java.util.Scanner;

public class B10812 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=i+1;
        }
        int M=s.nextInt();
        for (int T = 0; T < M; T++) {
            int i=s.nextInt();
            int j=s.nextInt();
            int k=s.nextInt();
            if(i!=k){
                int[] chg=new int[j-i+1];
                for (int l = 0; l < chg.length; l++) {
                    chg[l]=arr[k-1];
                    k++;
                    if(k>j){
                        k=i;
                    }
                }
                for (int l = 0, m=i-1; l < chg.length; l++,m++) {
                    arr[m]=chg[l];
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int a:arr){
            sb.append(a).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
