package baekjoon;

import java.util.Scanner;

public class B1330 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int A=s.nextInt();
        int B=s.nextInt();

        if (A>B){
            System.out.print(">");
        }
        else if (A<B) {
            System.out.print("<");
        }
        else{
            System.out.print("==");
        }
    }
}
