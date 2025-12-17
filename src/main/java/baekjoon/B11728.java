package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B11728 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),M=s.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < N+M; i++) {
            l.add(s.nextInt());
        }
        Collections.sort(l);
        StringBuilder sb=new StringBuilder();
        for(int a:l){
            sb.append(a).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
