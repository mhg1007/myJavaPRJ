package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2747 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        int n=s.nextInt();
        for (int i = 0; i < n-1; i++) {
            list.add(list.get(list.size()-1)+list.get(list.size()-2));
        }
        System.out.print(list.get(n));
    }
}
