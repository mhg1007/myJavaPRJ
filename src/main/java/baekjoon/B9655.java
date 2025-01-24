package baekjoon;

import java.util.Scanner;

public class B9655 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int w1=N/3;
        int w2=N%3;
        int win=w1+w2;

        if(win%2==0){
            System.out.print("CY");
        }
        else{
            System.out.print("SK");
        }
    }
}
