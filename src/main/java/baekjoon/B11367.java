package baekjoon;

import java.util.Scanner;

public class B11367 {
    public static String scr(int n){
        if(n>96){
            return "A+";
        }
        else if(n>89){
            return "A";
        }
        else if(n>86){
            return "B+";
        }
        else if(n>79){
            return "B";
        }
        else if(n>76){
            return "C+";
        }
        else if(n>69){
            return "C";
        }
        else if(n>66){
            return "D+";
        }
        else if(n>59){
            return "D";
        }
        else{
            return "F";
        }
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
