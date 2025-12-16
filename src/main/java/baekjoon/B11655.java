package baekjoon;

import java.util.Scanner;

public class B11655 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ln=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ln.length(); i++) {
            char ch=ln.charAt(i);
            if(ch>=97 && ch<=122){
                ch+=13;
                if(ch>122){
                    ch-=26;
                }
            }
            else if(ch>=65 && ch<=90){
                ch+=13;
                if(ch>90){
                    ch-=26;
                }
            }
            sb.append(ch);
        }
        System.out.print(sb);
    }
}
