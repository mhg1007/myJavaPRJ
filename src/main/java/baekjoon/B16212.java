package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B16212 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] a=new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for(int b:a){
            sb.append(b).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
