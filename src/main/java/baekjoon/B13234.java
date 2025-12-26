package baekjoon;

import java.util.Scanner;

public class B13234 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String nr=s.next();
        String b=s.next();
        boolean c=true;
        if(nr.equals("AND")){
            c=a.equals("true")&&b.equals("true");
        }
        else if(nr.equals("OR")){
            c=a.equals("true")||b.equals("true");
        }
        System.out.print(c);
    }
}
