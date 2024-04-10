package baekjoon;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = A*60+B-45;
        int D,E;

        if (A==0 && B<45){
            D=23;
            E=C%60+60;
        }
        else{
            D=C/60;
            E=C%60;
        }

        System.out.print(D+" "+E);
    }
}
