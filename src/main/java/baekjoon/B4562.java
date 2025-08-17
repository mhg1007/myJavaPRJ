package baekjoon;

import java.util.Scanner;

public class B4562 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int x=s.nextInt();
            int y=s.nextInt();
            if(x>=y){
                System.out.println("MMM BRAINS");
            }
            else{
                System.out.println("NO BRAINS");
            }
        }
    }
}
