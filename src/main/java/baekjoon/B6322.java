package baekjoon;

import java.util.Scanner;

public class B6322 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=0;
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a==0 && b==0 && c==0){
                break;
            }
            seq++;
            String wh="";
            int mid=0;
            double x=0;
            if(a==-1){
                wh="a";
                mid=c*c-b*b;
            }
            else if(b==-1){
                wh="b";
                mid=c*c-a*a;
            }
            else if(c==-1){
                wh="c";
                mid=a*a+b*b;
            }
            System.out.println("Triangle #" + seq);
            if(mid>0) {
                x=Math.sqrt(mid);
                System.out.printf("%s = %.3f\n", wh, x);
            }
            else{
                System.out.println("Impossible.");
            }
            System.out.println();
        }
    }
}
