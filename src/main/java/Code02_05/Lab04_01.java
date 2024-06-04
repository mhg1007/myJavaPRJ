package Code02_05;

import java.util.Scanner;
public class Lab04_01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("문자를 입력하세요: ");
        String ss=s.next();
        int len=ss.length();

        System.out.println("반대 문자열: ");
        for (int i=len-1; i>=0; i--){
            System.out.print(ss.charAt(i));
        }
    }
}
