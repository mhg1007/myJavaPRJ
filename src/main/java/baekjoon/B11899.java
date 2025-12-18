package baekjoon;

import java.util.Scanner;

public class B11899 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        while(S.contains("()")){
            S=S.replace("()","");
        }
        System.out.print(S.length());
    }
}
