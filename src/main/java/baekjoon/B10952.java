package baekjoon;

import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        while(true){
            int A=s.nextInt();
            int B=s.nextInt();
            if (A+B==0){
                break;
            }
            System.out.println(A+B);
        }
    }
}
