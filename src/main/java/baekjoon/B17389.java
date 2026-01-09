package baekjoon;

import java.util.Scanner;

public class B17389 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sq=0,sc=0,bs=0;
        for(char c:s.next().toCharArray()){
            sq++;
            if(c=='O'){
                sc+=sq+bs;
                bs++;
            }
            else if(c=='X'){
                bs=0;
            }
        }
        System.out.print(sc);
    }
}
