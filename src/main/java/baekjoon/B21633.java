package baekjoon;

import java.util.Scanner;

public class B21633 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        double cms=25+(double)k/100.0;
        if(cms<100){
            cms=100.0;
        }
        else if(cms>2000){
            cms=2000.0;
        }
        System.out.printf("%.2f",cms);
    }
}
