package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B11931 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.nextInt());
        }
        l.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int a:l){
            sb.append(a).append("\n");
        }
        System.out.print(sb);
    }
}
