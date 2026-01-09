package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B17206 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] a=new int[t];
        for (int i = 0; i < t; i++) {
            a[i]=s.nextInt();
        }
        int[] b=a.clone();
        Arrays.sort(b);
        int mx=0;
        Map<Integer,Long> m=new HashMap<>();
        for (int i = 0; i < t; i++) {
            int n=b[i];
            long sum=i==0?0:m.get(b[i-1]);
            for (int j = mx+1; j <= n; j++) {
                if(j%3==0||j%7==0){
                    sum+=j;
                    mx=j;
                }
            }
            m.put(n,sum);
        }
        StringBuilder sb=new StringBuilder();
        for(int c:b){
            sb.append(m.get(c)).append("\n");
        }
        System.out.print(sb);
    }
}
