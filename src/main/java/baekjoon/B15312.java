package baekjoon;

import java.util.Scanner;

public class B15312 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();

        char[] apb={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] hs={3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        String ac="",bc="";
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < apb.length; j++) {
                if(A.charAt(i)==apb[j]){
                    ac+=String.valueOf(hs[j]);
                }
                if(B.charAt(i)==apb[j]){
                    bc+=String.valueOf(hs[j]);
                }
            }
        }
        String abc="";
        for (int i = 0; i < A.length(); i++) {
            abc+=String.valueOf(ac.charAt(i));
            abc+=String.valueOf(bc.charAt(i));
        }
        while (abc.length()!=2){
            abc=gh(abc);
        }
        System.out.println(abc);
    }
    public static String gh(String a){
        String ch="";
        for (int i = 0; i < a.length()-1; i++) {
            int d=Integer.parseInt(String.valueOf(a.charAt(i)));
            int e=Integer.parseInt(String.valueOf(a.charAt(i+1)));
            int f=(d+e)%10;
            ch+=String.valueOf(f);
        }
        return ch;
    }
}
