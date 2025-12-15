package baekjoon;

import java.util.Scanner;

public class B11648 {
    public static int mp(int a){
        int b=1;
        for(char c:String.valueOf(a).toCharArray()){
            b*=Character.getNumericValue(c);
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int seq=0;
        while(t>9){
            t=mp(t);
            seq++;
        }
        System.out.print(seq);
    }
}
