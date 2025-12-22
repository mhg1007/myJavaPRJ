package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B10815 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(s.nextInt());
        }
        int m=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(set.contains(s.nextInt())?1:0).append(" ");
        }
        System.out.print(sb);
    }
}
