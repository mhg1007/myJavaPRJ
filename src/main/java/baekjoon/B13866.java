package baekjoon;

import java.util.Scanner;

public class B13866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=s.nextInt();
        }
        System.out.print(Math.abs((arr[0]+arr[3])-(arr[1]+arr[2])));
    }
}
