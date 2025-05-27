package baekjoon;

import java.util.Scanner;

public class B1871 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String np=s.next();
            String l=np.substring(0,3);
            int ll=0;
            for (int j = 0; j < 3; j++) {
                ll+=(l.charAt(j)-65)*(int)Math.pow(26,2-j);
            }
            int d=Integer.parseInt(np.substring(4));
            int v=Math.abs(ll-d);
            System.out.println(v<=100?"nice":"not nice");
        }
    }
}
