package baekjoon;

import java.util.Scanner;

public class B16486 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int d1=s.nextInt();
        int d2=s.nextInt();

        double round=d1*2+d2*2*3.141592;
        System.out.print(round);
    }
}
