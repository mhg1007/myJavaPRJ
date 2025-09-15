package baekjoon;

import java.util.Scanner;

public class B5613 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int stt=s.nextInt();
        while(true){
            String cl=s.next();
            if(cl.equals("="))break;
            int nxt=s.nextInt();
            switch(cl){
                case "+":
                    stt+=nxt;
                    break;
                case "-":
                    stt-=nxt;
                    break;
                case "*":
                    stt*=nxt;
                    break;
                case "/":
                    stt/=nxt;
                    break;
            }
        }
        System.out.print(stt);
    }
}
