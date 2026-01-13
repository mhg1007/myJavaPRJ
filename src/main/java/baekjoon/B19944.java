package baekjoon;

import java.util.Scanner;

public class B19944 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        if(M==1||M==2){
            System.out.print("NEWBIE!");
        }
        else if (M<=N) {
            System.out.print("OLDBIE!");
        }
        else{
            System.out.print("TLE!");
        }
    }
}
