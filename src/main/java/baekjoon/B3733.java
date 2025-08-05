package baekjoon;

import java.util.Scanner;

public class B3733 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            int N=s.nextInt();
            int S=s.nextInt();
            System.out.println(S/(N+1));
        }
    }
}
