package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B21200 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int P=s.nextInt();
        int S=s.nextInt();
        for (int i = 0; i < S; i++) {
            int m=s.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(s.nextInt());
            }
            System.out.println(list.contains(P)?"KEEP":"REMOVE");
        }
    }
}
