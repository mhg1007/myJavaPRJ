package baekjoon;

import java.util.Scanner;

public class B16018 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String a=s.next();
        String b=s.next();
        int count=0;
        for (int i = 0; i < N; i++) {
            if(a.charAt(i)=='C'&&b.charAt(i)=='C'){
                count++;
            }
        }
        System.out.print(count);
    }
}
