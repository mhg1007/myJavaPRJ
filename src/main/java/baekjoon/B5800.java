package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B5800 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        StringBuilder sbo=new StringBuilder();
        for (int i = 0; i < K; i++) {
            int N=s.nextInt();
            int[] arr=new int[N];
            for (int j = 0; j < N; j++) {
                arr[j]=s.nextInt();
            }
            Arrays.sort(arr);

            int lg=0;
            for (int j = 0; j < N-1; j++) {
                int gap=arr[j+1]-arr[j];
                if(gap>lg){
                    lg=gap;
                }
            }

            StringBuilder sb=new StringBuilder("Class ");
            sb.append(i+1).append("\n");
            sb.append("Max ").append(arr[arr.length-1]).append(", ");
            sb.append("Min ").append(arr[0]).append(", ");
            sb.append("Largest gap ").append(lg);
            sbo.append(sb).append("\n");
        }
        System.out.print(sbo);
    }
}
