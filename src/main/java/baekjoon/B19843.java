package baekjoon;

import java.util.Map;
import java.util.Scanner;

public class B19843 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(),n=s.nextInt();
        Map<String,Integer> m=Map.of("Mon",0,"Tue",1,"Wed",2,"Thu",3,"Fri",4,"Sat",5,"Sun",6);
        int hs=0;
        for (int i = 0; i < n; i++) {
            String d1=s.next();
            int h1=s.nextInt();
            String d2=s.next();
            int h2=s.nextInt();
            hs+=m.get(d2)*24+h2-(m.get(d1)*24+h1);
        }
        int hh=t-hs;
        System.out.print(hh<=48?(hs>t?0:hh):-1);
    }
}
