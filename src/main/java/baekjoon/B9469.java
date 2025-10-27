package baekjoon;

import java.util.Scanner;

public class B9469 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int P=s.nextInt();
        for (int i = 0; i < P; i++) {
            int N=s.nextInt();
            System.out.printf("%d %.6f\n",N,s.nextDouble()/(s.nextDouble()+s.nextDouble())*s.nextDouble());
        }
    }
}
