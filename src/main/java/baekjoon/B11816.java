package baekjoon;

import java.util.Scanner;

public class B11816 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String X=s.next();
        int x;
        if(X.charAt(0)=='0'){
            if(X.charAt(1)=='x'){
                x=Integer.parseInt(X.substring(2),16);
            }
            else{
                x=Integer.parseInt(X,8);
            }
        }
        else{
            x=Integer.parseInt(X);
        }
        System.out.print(x);
    }
}
