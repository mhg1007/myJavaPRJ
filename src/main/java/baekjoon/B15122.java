package baekjoon;

import java.util.Scanner;

public class B15122 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int a=1;
        while(String.valueOf(k+a).contains("0")){
            a++;
        }
        System.out.println(k+a);
    }
}
