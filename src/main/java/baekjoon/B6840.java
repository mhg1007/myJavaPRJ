package baekjoon;

import java.util.*;

public class B6840 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={s.nextInt(),s.nextInt(),s.nextInt()};
        Arrays.sort(a);
        System.out.print(a[1]);
    }
}
