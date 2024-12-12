package baekjoon;

import java.util.Scanner;

public class B11179 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String ns=Integer.toBinaryString(N);
        String sn="";
        for (int i = ns.length()-1; i > -1; i--) {
            sn+=ns.charAt(i);
        }
        int NN=0;
        for (int i = sn.length()-1; i > -1 ; i--) {
            NN+=Integer.parseInt(String.valueOf(sn.charAt(i)))*(int)Math.pow(2,sn.length()-1-i);
        }
        System.out.print(NN);
    }
}
