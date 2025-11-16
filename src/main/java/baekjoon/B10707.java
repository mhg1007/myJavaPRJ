package baekjoon;

import java.util.Scanner;

public class B10707 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        int P=s.nextInt();
        int X=a[0]*P;
        int Y=P<=a[2]?a[1]:a[1]+(P-a[2])*a[3];
        System.out.print(Math.min(X,Y));
    }
}
