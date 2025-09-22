package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B5939 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
            arr[i][2] = s.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] row : arr) {
            sb.append(row[0]).append(" ").append(row[1]).append(" ").append(row[2]).append("\n");
        }
        System.out.print(sb);
    }
}
