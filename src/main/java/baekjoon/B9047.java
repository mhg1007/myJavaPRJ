package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B9047 {
    public static int kprk(int n){
        String s = String.valueOf(n);
        if(s.length()<4){
            s="0".repeat(4-s.length())+s;
        }
        String[] ss=s.split("");
        Arrays.sort(ss);
        StringBuilder sb=new StringBuilder();
        for(String b:ss){
            sb.append(b);
        }
        int c=Integer.parseInt(sb.toString());
        int d=Integer.parseInt(sb.reverse().toString());
        return d-c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            int cnt=0;
            while(n!=6174){
                n=kprk(n);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
