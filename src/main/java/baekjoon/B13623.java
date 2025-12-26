package baekjoon;

import java.util.Scanner;

public class B13623 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        String wnr;
        if(A==B){
            if(B==C){
                wnr="*";
            }
            else{
                wnr="C";
            }
        }
        else{
            if(B==C){
                wnr="A";
            }
            else{
                wnr="B";
            }
        }
        System.out.print(wnr);
    }
}
