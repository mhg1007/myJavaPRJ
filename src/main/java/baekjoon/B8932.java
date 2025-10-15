package baekjoon;

import java.util.Scanner;

public class B8932 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double[] a={9.23076,1.84523,56.0211,4.99087,0.188807,15.9803,0.11193};
        double[] b={26.7,75,1.5,42.5,210,3.8,254};
        double[] c={1.835,1.348,1.05,1.81,1.41,1.04,1.88};
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int scr=0;
            for (int j = 0; j < 7; j++) {
                int p=s.nextInt();
                scr+= (int) (a[j]*Math.pow(j%3==0?b[j]-p:p-b[j],c[j]));
            }
            System.out.println(scr);
        }
    }
}
