package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2748 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Long> list=new ArrayList<>();
        list.add(0L);
        list.add(1L);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        System.out.print(list.get(list.size()-1));
    }
}
