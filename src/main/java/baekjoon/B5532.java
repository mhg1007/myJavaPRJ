package baekjoon;

import java.util.Scanner;

public class B5532 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int D=s.nextInt();
        int kor= (int) Math.ceil((double) A /C);
        int math= (int) Math.ceil((double) B /D);
        System.out.print(L-Math.max(kor,math));
    }
}
