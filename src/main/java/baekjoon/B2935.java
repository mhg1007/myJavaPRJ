package baekjoon;

import java.util.Scanner;

public class B2935 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String cal=s.next();
        String B=s.next();
        StringBuilder sb=new StringBuilder();
        if(cal.equals("+")){
            if(A.length()>B.length()){
                sb.append(A, 0, A.length()-B.length()).append(B);
            }
            else if(A.length()==B.length()){
                sb.append(A.replace("1","2"));
            }
            else{
                sb.append(B, 0, B.length()-A.length()).append(A);
            }
        }
        else if(cal.equals("*")){
            int seq=A.length()+B.length()-2;
            sb.append("1");
            sb.append("0".repeat(seq));
        }
        System.out.print(sb);
    }
}
