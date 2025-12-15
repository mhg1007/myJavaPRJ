package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B11651 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new int[]{s.nextInt(), s.nextInt()});
        }
        list.sort((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        StringBuilder sb=new StringBuilder();
        for(int[] a:list){
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
