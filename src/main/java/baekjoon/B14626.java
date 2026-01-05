package baekjoon;

import java.util.Scanner;

public class B14626 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String isbn=s.next();
        int chk=0;
        boolean trp=false;
        for (int i = 0; i < isbn.length()-1; i++) {
            char c=isbn.charAt(i);
            if(c!='*'){
                int v=Character.getNumericValue(c);
                chk += i%2==0? v : v*3;
            }
            else{
                trp = i%2!=0;
            }
        }
        int m=Character.getNumericValue(isbn.charAt(isbn.length()-1));
        for (int i = 0; i <= 9; i++) {
            int r=i;
            if(trp){
                r=i*3;
            }
            if((r+chk+m)%10==0){
                System.out.print(i);
                break;
            }
        }
    }
}
