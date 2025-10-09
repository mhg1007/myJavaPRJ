package baekjoon;

import java.util.Scanner;

public class B7595 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            int n=s.nextInt();
            if(n==0){
                break;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
