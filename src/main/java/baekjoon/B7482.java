package baekjoon;

import java.util.Scanner;

public class B7482 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            double a=s.nextDouble();
            System.out.printf("%.10f\n",a/6);
        }
    }
}
