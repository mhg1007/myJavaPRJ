package baekjoon;

import java.util.Scanner;

public class B1919 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        int len=a.length()+b.length();
        int same=0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i)==b.charAt(j)){
                    same++;
                    a=a.replaceFirst(String.valueOf(a.charAt(i)),"");
                    b=b.replaceFirst(String.valueOf(b.charAt(j)),"");
                    i-=1;
                    j=0;
                    break;
                }
            }
        }
        System.out.print(len-same*2);
    }
}
