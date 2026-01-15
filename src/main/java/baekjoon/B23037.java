package baekjoon;

import java.util.Scanner;

public class B23037 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+= (int) Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))),5);
        }
        System.out.print(sum);
    }
}
