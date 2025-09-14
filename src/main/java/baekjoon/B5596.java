package baekjoon;

import java.util.Scanner;

public class B5596 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=0,b=0;
        for (int i = 0; i < 4; i++) {
            a+=s.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            b+=s.nextInt();
        }
        System.out.print(Math.max(a,b));
    }
}
