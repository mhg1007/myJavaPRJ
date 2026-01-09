package baekjoon;

import java.util.Scanner;

public class B17288 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        int cnt=0;
        String cut=String.valueOf(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if(Character.getNumericValue(S.charAt(i-1))+1==Character.getNumericValue(S.charAt(i))){
                cut+=String.valueOf(S.charAt(i));
            }
            else{
                if(cut.length()==3){
                    cnt++;
                }
                cut=String.valueOf(S.charAt(i));
            }
        }
        if(cut.length()==3){
            cnt++;
        }
        System.out.print(cnt);
    }
}
