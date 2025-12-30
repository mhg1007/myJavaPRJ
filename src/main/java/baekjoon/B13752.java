package baekjoon;

import java.util.Scanner;

public class B13752 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int k=s.nextInt();
            for (int j = 0; j < k; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
