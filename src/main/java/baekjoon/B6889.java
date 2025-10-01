package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B6889 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < n+m; i++) {
            list.add(s.next());
        }
        for (int i = 0; i < n; i++) {
            for (int j = n; j < n+m; j++) {
                System.out.println(list.get(i)+" as "+list.get(j));
            }
        }
    }
}
