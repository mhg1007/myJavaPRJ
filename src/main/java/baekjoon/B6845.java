package baekjoon;

import java.util.Scanner;

public class B6845 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int y=s.nextInt();
            int m=s.nextInt();
            int d=s.nextInt();
            if(y<1989 || (y==1989 && m<2) || (y==1989 && m==2 && d<28)) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
