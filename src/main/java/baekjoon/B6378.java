package baekjoon;

import java.util.Scanner;

public class B6378 {
    public static String dgrt(String a){
        int sum=0;
        for (int i = 0; i < a.length(); i++) {
            sum+=Character.getNumericValue(a.charAt(i));
        }
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            String N=s.next();
            if(N.equals("0")) break;
            while (N.length()>1){
                N=dgrt(N);
            }
            System.out.println(N);
        }
    }
}
