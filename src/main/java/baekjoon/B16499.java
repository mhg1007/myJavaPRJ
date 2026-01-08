package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B16499 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String chg= Arrays.toString(arr).replaceAll("[^a-z]","");
            set.add(chg);
        }
        System.out.print(set.size());
    }
}
