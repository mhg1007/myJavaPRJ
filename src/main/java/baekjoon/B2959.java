package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2959 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        Arrays.sort(arr);
        System.out.print(Math.min(arr[0],arr[1])*Math.min(arr[2],arr[3]));
    }
}
