package baekjoon;

import java.util.Scanner;

public class B13699 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long[] tn=new long[36];
        tn[0]=1;
        tn[1]=1;
        for (int i = 2; i < 36; i++) {
            long tnf=0;
            for (int j = 0; j < i; j++) {
                tnf+=tn[j]*tn[i-1-j];
            }
            tn[i]=tnf;
        }
        System.out.println(tn[t]);
    }
}
