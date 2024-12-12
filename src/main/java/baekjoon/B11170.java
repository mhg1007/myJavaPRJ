package baekjoon;

import java.util.Scanner;

public class B11170 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int M=s.nextInt();
            int count=0;
            for (int j = N; j <=M ; j++) {
                String k=String.valueOf(j);
                for (int l = 0; l < k.length(); l++) {
                    if(k.charAt(l)=='0'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
