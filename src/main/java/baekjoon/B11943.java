package baekjoon;

import java.util.Scanner;

public class B11943 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
        System.out.print(Math.min(a+d,b+c));
    }
}
