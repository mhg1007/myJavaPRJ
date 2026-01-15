package baekjoon;

import java.util.Scanner;

public class B21966 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String S=s.next();
        if(N<=25){
            System.out.print(S);
        }
        else{
            int cnt=0;
            String cut=S.substring(11,N-11);
            for (int i = 0; i < cut.length(); i++) {
                if((int)cut.charAt(i)==46){
                    cnt++;
                }
            }
            if((cnt<=1 && cut.indexOf(".")==cut.length()-1)||cnt==0) {
                System.out.print(S.substring(0,11)+"..."+S.substring(N-11,N));
            }
            else{
                System.out.print(S.substring(0,9)+"......"+S.substring(N-10,N));
            }
        }
    }
}
