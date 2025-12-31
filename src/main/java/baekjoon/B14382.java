package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B14382 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 1; i <= T; i++) {
            int N=s.nextInt();
            StringBuilder sb=new StringBuilder("Case #");
            sb.append(i).append(": ");
            Set<Integer> set=new HashSet<>();

            if(N!=0) {
                int seq = 1;
                while (true) {
                    String ns = String.valueOf(N * seq);
                    for (int j = 0; j < ns.length(); j++) {
                        set.add(Character.getNumericValue(ns.charAt(j)));
                    }
                    if (set.size() == 10) {
                        sb.append(ns);
                        break;
                    }
                    seq++;
                }
            }
            else{
                sb.append("INSOMNIA");
            }
            System.out.println(sb);
        }
    }
}
