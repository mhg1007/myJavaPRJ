package baekjoon;

import java.util.Scanner;

public class B8949 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        while(A.length()!=B.length()){
            if(A.length()<B.length()){
                A="0"+A;
            }
            else{
                B="0"+B;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            sb.append(Character.getNumericValue(A.charAt(i))+Character.getNumericValue(B.charAt(i)));
        }
        System.out.print(sb);
    }
}
