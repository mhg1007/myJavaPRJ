package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2460 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int now=0;
        for (int i = 0; i < 10; i++) {
            int off=s.nextInt();
            now-=off;
            int on=s.nextInt();
            now+=on;
            list.add(now);
        }
        System.out.print(Collections.max(list));
    }
}
