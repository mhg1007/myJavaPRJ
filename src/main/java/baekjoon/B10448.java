package baekjoon;

import java.util.Scanner;

public class B10448 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] tn=new int[45];
        for (int i = 0; i < 45; i++) {
            tn[i]=(i+1)*(i+2)/2;
        }
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int K=s.nextInt();
            int chk=0;
            for (int j = 0; j < 45; j++) {
                for (int k = 0; k < 45; k++) {
                    for (int l = 0; l < 45; l++) {
                        if(tn[j]+tn[k]+tn[l]==K){
                            chk=1;
                            break;
                        }
                    }
                }
            }
            System.out.println(chk);
        }
    }
}
