package baekjoon;

import java.util.Scanner;

public class B2511 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] ar=new int[10];
        int[] br=new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i]=s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            br[i]=s.nextInt();
        }
        int sa=0,sb=0;
        String lw="";
        for (int i = 0; i < 10; i++) {
            if(ar[i]>br[i]){
                sa+=3;
                lw="A";
            }
            else if(ar[i]<br[i]){
                sb+=3;
                lw="B";
            }
            else{
                sa++;
                sb++;
            }
        }
        System.out.println(sa+" "+sb);
        System.out.print(sa==sb? (lw.isEmpty()? "D" : lw) : sa>sb? "A" : "B");
    }
}
