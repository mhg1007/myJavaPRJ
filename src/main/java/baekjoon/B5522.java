package baekjoon;

import java.util.Scanner;

public class B5522 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=s.nextInt();
        }
        System.out.print(sum);
    }
}
