package baekjoon;

import java.util.Scanner;

public class B5928 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int D=s.nextInt();
        int H=s.nextInt();
        int M=s.nextInt();
        int sum=0;
        if(D<11 || (D==11 && H<11) || (D==11 && H==11 && M<11)){
            sum=-1;
        }
        else{
            sum+=(D-11)*60*24;
            sum+=(H-11)*60;
            sum+=M-11;
        }
        System.out.print(sum);
    }
}
