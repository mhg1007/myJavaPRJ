package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B14495 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        List<Long> list=new ArrayList<>();
        list.add(1L);    list.add(1L);    list.add(1L);
        for (int i = 3; i < n; i++) {
            list.add(list.get(i-1)+list.get(i-3));
        }
        System.out.print(list.get(n-1));
    }
}
