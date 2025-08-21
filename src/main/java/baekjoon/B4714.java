package baekjoon;

import java.util.Scanner;

public class B4714 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            double X = s.nextDouble();
            if(X<0) break;
            double Y = X*0.167;
            StringBuilder sb=new StringBuilder("Objects weighing ");
            sb.append(String.format("%.2f", X)).append(" on Earth will weigh ").append(String.format("%.2f", Y)).append(" on the moon.");
            System.out.println(sb);
        }
    }
}
