package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B11478 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            StringBuilder sb=new StringBuilder(String.valueOf(S.charAt(i)));
            set.add(sb.toString());
            for (int j = i+1; j < S.length(); j++) {
                sb.append(S.charAt(j));
                set.add(sb.toString());
            }
        }
        System.out.print(set.size());
    }
}
