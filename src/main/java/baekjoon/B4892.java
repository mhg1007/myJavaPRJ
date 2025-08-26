package baekjoon;

import java.util.Scanner;

public class B4892 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int seq=0;
        while(true) {
            int n0=s.nextInt();
            if(n0==0) {
                break;
            }
            seq++;

            int n1 = n0*3;
            int n2 = n1%2==0? n1/2 : (n1+1)/2;
            int n3 = n2*3;
            int n4 = n3/9;

            System.out.println(seq + ". " + (n1 % 2 == 0 ? "even" : "odd") + " " + n4);
        }
    }
}
