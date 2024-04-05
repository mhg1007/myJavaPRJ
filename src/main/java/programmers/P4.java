package programmers;

import java.util.Scanner;

public class P4 { //문자열 섞기
    public static String solution4(String str1, String str2) {
        String answer = "";
        int a=str1.length();

        for(int i=0; i<a; i++){
            answer=answer+str1.substring(i,i+1)+str2.substring(i,i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("두 문자의 길이는 같아야 합니다");

        System.out.print("문자1: ");
        String a=s.next();

        System.out.print("문자2: ");
        String b=s.next();

        System.out.print(solution4(a,b));

    }
}
