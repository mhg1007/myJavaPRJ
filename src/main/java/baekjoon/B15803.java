package baekjoon;

import java.util.Scanner;

public class B15803 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] x=new int[3];
        int[] y=new int[3];
        for (int i = 0; i < 3; i++) {
            x[i]=s.nextInt();
            y[i]=s.nextInt();
        }
        boolean chk;
        if(x[0]==x[1]){
            chk = x[1] == x[2];
        } else if (y[0]==y[1]) {
            chk = y[1] == y[2];
        } else {
            double tilt = (y[1] - y[0]) / (double) (x[1] - x[0]);
            chk= x[2] * tilt == y[2];
        }
        System.out.print(chk?"WHERE IS MY CHICKEN?" : "WINNER WINNER CHICKEN DINNER!");
    }
}
