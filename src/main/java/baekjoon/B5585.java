package baekjoon;

import java.util.Scanner;

public class B5585 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l=1000-s.nextInt();
        int ea=0;
        int[] arr={500,100,50,10,5,1};
        for (int j : arr) {
            ea += l / j;
            l = l % j;
        }
        System.out.print(ea);
    }
}
