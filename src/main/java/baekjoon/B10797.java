package baekjoon;

import java.util.Scanner;

public class B10797 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d=s.nextInt();
        int check=0;
        for (int i = 0; i < 5; i++) {
            int c=s.nextInt();
            if(c==d){
                check++;
            }
        }
        System.out.print(check);
    }
}
