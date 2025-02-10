package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B15720 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int B=s.nextInt();
        int C=s.nextInt();
        int D=s.nextInt();
        int mx=Math.max(B,Math.max(C,D));
        int[] bg=new int[mx];
        int[] sd=new int[mx];
        int[] bv=new int[mx];
        int bfsum=0;
        for (int i = 0; i < B; i++) {
            bg[i]=s.nextInt();
            bfsum+=bg[i];
        }
        for (int i = 0; i < C; i++) {
            sd[i]=s.nextInt();
            bfsum+=sd[i];
        }
        for (int i = 0; i < D; i++) {
            bv[i]=s.nextInt();
            bfsum+=bv[i];
        }
        System.out.println(bfsum);

        Arrays.sort(bg);
        Arrays.sort(sd);
        Arrays.sort(bv);
        int afsum=0;
        for (int i = 0; i < mx; i++) {
            int ss=bg[i]+sd[i]+bv[i];
            if(bg[i]!=0 && sd[i]!=0 && bv[i]!=0){
                afsum+=(int)(ss*0.9);
            }
            else{
                afsum+=ss;
            }
        }
        System.out.print(afsum);
    }
}
