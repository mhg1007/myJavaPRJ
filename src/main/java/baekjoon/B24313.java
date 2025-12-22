package baekjoon;

import java.util.Scanner;

public class B24313 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
        boolean e=true;
        for (int i = d; i < 102; i++) {
            e=(a-c)*i+b<=0;
            if(!e) break;
        }
        System.out.print(e?1:0);
    }
}
