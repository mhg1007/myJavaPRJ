package baekjoon;

import java.util.Scanner;

public class B34323 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt(),m=s.nextInt(),p=s.nextInt();
        System.out.print(Math.min((100-n)*p*(m+1)/100,m*p));
    }
}
