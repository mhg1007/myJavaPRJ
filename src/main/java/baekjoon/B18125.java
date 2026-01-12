package baekjoon;

import java.util.Scanner;

public class B18125 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        int[][] arr = new int[C][R];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[][] arr2 = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr2[C-1-j][i] = s.nextInt();
            }
        }
        boolean chk = true;
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    chk = false;
                    break;
                }
            }
        }
        System.out.print(chk ?
                "|>___/|        /}\n" +
                        "| O < |       / }\n" +
                        "(==0==)------/ }\n" +
                        "| ^  _____    |\n" +
                        "|_|_/     ||__|" :
                "|>___/|     /}\n" +
                        "| O O |    / }\n" +
                        "( =0= )\"\"\"\"  \\\n" +
                        "| ^  ____    |\n" +
                        "|_|_/    ||__|");
    }
}
