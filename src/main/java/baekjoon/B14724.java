package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B14724 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] crc={"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int mx=0;
            for (int j = 0; j < N; j++) {
                mx=Math.max(mx,s.nextInt());
            }
            list.add(mx);
        }
        System.out.print(crc[list.indexOf(Collections.max(list))]);
    }
}
