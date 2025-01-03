package baekjoon;

import java.util.Scanner;

public class B1094 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        String bin=Integer.toBinaryString(X);
        int count=0;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
