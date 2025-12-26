package baekjoon;

import java.util.Scanner;

public class B13234 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String nr=s.next();
        String b=s.next();
        String c="";
        if(nr.equals("AND")){
            if(a.equals("true")&&b.equals("true")){
                c="true";
            }
            else{
                c="false";
            }
        }
        else if(nr.equals("OR")){
            if(a.equals("true")||b.equals("true")){
                c="true";
            }
            else{
                c="false";
            }
        }
        System.out.print(c);
    }
}
