package baekjoon;

import java.util.Scanner;

public class B20001 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String stt=s.nextLine();
        int bg=0;
        while(true){
            String dbg=s.nextLine();
            if(dbg.equals("고무오리 디버깅 끝")){
                System.out.print(bg==0?"고무오리야 사랑해":"힝구");
                break;
            }
            if(dbg.equals("문제")){
                bg++;
            }
            else{
                bg+= bg!=0?-1:2;
            }
        }
    }
}
