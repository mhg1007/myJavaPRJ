package baekjoon;

import java.util.Scanner;

public class B10039 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 5; i++) {
            int scr=s.nextInt();
            if(scr<40){
                scr=40;
            }
            sum+=scr;
        }
        System.out.print(sum/5);
    }
}
