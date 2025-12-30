package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B13771 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<Double> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(s.nextDouble());
        }
        Collections.sort(list);
        System.out.printf("%.2f",list.get(1));
    }
}
