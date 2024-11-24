package baekjoon;

import java.util.Scanner;

public class B1357 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        System.out.print(rev(rev(X)+rev(Y)));
    }
    public static int rev(int a){
        String str=String.valueOf(a);
        String ch="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ch+=str.charAt(i);
        }
        return Integer.parseInt(ch);
    }
}
