package baekjoon;

import java.util.Scanner;

public class B17284 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={0,500,800,1000};
        int m=5000;
        while(s.hasNextInt()){
            m-=a[s.nextInt()];
        }
        System.out.print(m);
    }
}
