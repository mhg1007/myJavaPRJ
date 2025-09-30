package baekjoon;

import java.util.Scanner;

public class B6825 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double w=s.nextDouble();
        double h=s.nextDouble();
        double bmi=w/(h*h);
        String ans="";
        if(bmi>25){
            ans="Overweight";
        }
        else if(bmi>=18.5){
            ans="Normal weight";
        }
        else {
            ans="Underweight";
        }
        System.out.print(ans);
    }
}
