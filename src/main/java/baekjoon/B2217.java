package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2217 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }
        Collections.sort(list);
        int mul=1;
        for (int i = N-1; i >=0; i--) {
            int rp=list.get(i);
            list.add(rp*mul);
            mul++;
        }
        System.out.print(Collections.max(list));
    }
}
