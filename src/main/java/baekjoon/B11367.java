package baekjoon;

import java.util.Scanner;

public class B11367 {
    public static String scr(int n){
        String ans;
        if(n>96){
            ans="A+";
        }
        else if(n>89){
            ans="A";
        }
        else if(n>86){
            ans="B+";
        }
        else if(n>79){
            ans="B";
        }
        else if(n>76){
            ans="C+";
        }
        else if(n>69){
            ans="C";
        }
        else if(n>66){
            ans="D+";
        }
        else if(n>59){
            ans="D";
        }
        else{
            ans="F";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String hb=s.nextLine();
            System.out.println(hb.substring(0,hb.indexOf(" "))+" "+scr(Integer.parseInt(hb.substring(hb.indexOf(" ")+1))));
        }
    }
}
