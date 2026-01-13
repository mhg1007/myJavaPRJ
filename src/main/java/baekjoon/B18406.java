package baekjoon;

import java.util.Scanner;

public class B18406 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String NN=String.valueOf(N);
        int ln=NN.length();
        int sum1=0,sum2=0;
        for (int i = 0; i < ln/2; i++) {
            sum1+=Character.getNumericValue(NN.charAt(i));
        }
        for (int i = ln/2; i < ln; i++) {
            sum2+=Character.getNumericValue(NN.charAt(i));
        }
        if(sum1==sum2){
            System.out.print("LUCKY");
        }
        else{
            System.out.print("READY");
        }
    }
}
