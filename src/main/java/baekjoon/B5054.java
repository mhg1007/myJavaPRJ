package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B5054 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(s.nextInt());
            }
            System.out.println((Collections.max(list)-Collections.min(list))*2);
        }
    }
}
