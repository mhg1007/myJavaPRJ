package baekjoon;

import java.util.Scanner;

public class B17548 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String grt=s.next();
        if(grt.equals("Later!")){
            System.out.print("Alligator!");
        }
        else{
            System.out.print("h"+"e".repeat((grt.length()-2)*2)+"y");
        }
    }
}
