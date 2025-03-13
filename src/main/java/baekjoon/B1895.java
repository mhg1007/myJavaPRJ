package baekjoon;

import java.util.*;

public class B1895 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[][] arr2 = new int[R - 2][C - 2];
        for (int i = 1, j = 1; i < R - 1; j++) {
            List<Integer> list = new ArrayList<>();
            for (int k = i - 1, l = j - 1; k <= i + 1; l++) {

                list.add(arr[k][l]);
                if (l == j + 1) {
                    l = j - 2;
                    k++;
                }
            }
            Collections.sort(list);
            arr2[i - 1][j - 1] = list.get(4);
            if (j == C - 2) {
                j = 0;
                i++;
            }
        }
        int T = s.nextInt();
        int cnt = 0;
        for (int[] a : arr2) {
            for (int b : a) {
                if (b >= T) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
