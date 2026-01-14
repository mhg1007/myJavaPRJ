package baekjoon;

import java.util.Scanner;

public class B20528 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String tmp=s.next();
        boolean chk=true;
        for (int i = 0; i < N-1; i++) {
            String nxt=s.next();
            if(tmp.charAt(tmp.length()-1)!=nxt.charAt(0)){
                chk=false;
                break;
            }
            tmp=nxt;
        }
        System.out.print(chk?1:0);
    }
}
