package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B15351 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+65));
        }
        int N=s.nextInt();
        s.nextLine();
        for (int i = 0; i < N; i++) {
            String lf=s.nextLine();
            int scr=0;
            for (int j = 0; j < lf.length(); j++) {
                char c=lf.charAt(j);
                if(c!=' '){
                    scr+=list.indexOf(c)+1;
                }
            }
            System.out.println(scr==100?"PERFECT LIFE":scr);
        }
    }
}
