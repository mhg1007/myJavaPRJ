package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B4659 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> vw=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        while(true){
            String pwd=s.next();
            if(pwd.equals("end")) break;
            boolean chk=true;
            int vc=0;
            int rr=0;
            for (int i = 0; i < pwd.length(); i++) {
                if(vw.contains(pwd.charAt(i))){
                    vc++;
                    if(i<pwd.length()-1 && vw.contains(pwd.charAt(i+1))){
                        rr++;
                    }
                    else{
                        rr=0;
                    }
                }
                else{
                    if(i<pwd.length()-1 && !vw.contains(pwd.charAt(i+1))){
                        rr++;
                    }
                    else{
                        rr=0;
                    }
                }
                if(rr==2){
                    chk=false;
                }

                if((pwd.charAt(i)!='e' && pwd.charAt(i)!='o')
                        && (i<pwd.length()-1 && pwd.charAt(i)==pwd.charAt(i+1))){
                    chk=false;
                }
            }
            if(vc==0){
                chk=false;
            }
            System.out.println("<"+pwd+"> is "+(chk?"":"not ")+"acceptable.");
        }
    }
}
