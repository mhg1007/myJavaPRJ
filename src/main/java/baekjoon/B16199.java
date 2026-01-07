package baekjoon;

import java.util.Scanner;

public class B16199 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] ar1={s.nextInt(), s.nextInt(), s.nextInt()};
        int[] ar2={s.nextInt(), s.nextInt(), s.nextInt()};
        int fa=ar2[1]>ar1[1]||(ar2[1]==ar1[1]&&ar2[2]>=ar1[2])?ar2[0]-ar1[0]:ar2[0]-ar1[0]-1;
        int ka=ar2[0]-ar1[0]+1;
        int ya=ar2[0]-ar1[0];
        System.out.print(fa+"\n"+ka+"\n"+ya);
    }
}
