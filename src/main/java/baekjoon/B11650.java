package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11650 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        StringBuilder sb=new StringBuilder();
        for(int[] a:arr){
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
