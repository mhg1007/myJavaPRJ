package baekjoon;

import java.util.Scanner;

public class B17874 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int h=s.nextInt();
        int v=s.nextInt();
        System.out.print(Math.max(n-h,h)*Math.max(n-v,v)*4);
    }
}
