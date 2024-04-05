package programmers;

import java.util.Scanner;

public class P3 {   //문자열 겹쳐쓰기

    public static String solution3(String my_string, String overwrite_string, int s) {
        String answer = "";
        int a = my_string.length();
        int b = overwrite_string.length();

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + b, a);

        return answer;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("원본 문자열: ");
        String my_string = s.next();

        System.out.print("변환 문자열: ");
        String overwrite_string = s.next();

        System.out.print("시작 위치(정수): ");
        int ss=s.nextInt();

        System.out.print(solution3(my_string,overwrite_string,ss));


    }

}
