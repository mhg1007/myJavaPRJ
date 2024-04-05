package baekjoon;

import java.util.Scanner;
public class B11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A=s.nextLine();
        int firB=A.indexOf(" ");
        int secB=A.indexOf(" ",firB+1);
        int strLen=A.length();

        String BB=A.substring(0,firB);
        String CC=A.substring(firB+1,secB);
        String DD=A.substring(secB+1,strLen);

        long B=Long.parseLong(BB);  //문제 조건에 1<=A,B,C<=10^12 범위가 주어진 것을 이해하지 못하고
        long C=Long.parseLong(CC);  //처음에 Integer.parseInt()를 사용했다가 오류 발생
        long D=Long.parseLong(DD);  //주어진 범위에 맞게 long형으로 변경하니 정답처리

        System.out.print(B+C+D);
    }
}
