package baekjoon;

import java.util.Scanner;

public class B5692 {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            if(a==0) break;
            String as=String.valueOf(a);
            int ft=0;
            for (int i = 0; i < as.length(); i++) {
                int aa=Character.getNumericValue(as.charAt(i));
                ft+=aa*fact(as.length()-i);
            }
            System.out.println(ft);
        }
    }
}
