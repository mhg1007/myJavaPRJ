package baekjoon;

import java.util.Scanner;

public class B10474 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a==0 && b==0) break;
            System.out.println((a/b)+" "+(a%b)+" / "+b);
        }
    }
}
