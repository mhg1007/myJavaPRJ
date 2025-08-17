package baekjoon;

import java.util.Scanner;

public class B4539 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int x=s.nextInt();
            double c=x;
            int seq=0;
            while(String.valueOf((int)c).length()>1){
                c=Math.round(c/10);
                seq++;
            }
            System.out.println((int)(c*Math.pow(10,seq)));
        }
    }
}
