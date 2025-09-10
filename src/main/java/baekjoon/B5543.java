package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B5543 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[] bg=new int[3];
        bg[0]=s.nextInt();
        bg[1]=s.nextInt();
        bg[2]=s.nextInt();
        Arrays.sort(bg);

        int[] bv=new int[2];
        bv[0]=s.nextInt();
        bv[1]=s.nextInt();
        Arrays.sort(bv);

        System.out.print(bg[0]+bv[0]-50);
    }
}
