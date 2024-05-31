package baekjoon;
import java.util.Scanner;
public class B2738 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[][] A=new int[N][M];
        int[][] B=new int[N][M];
        int[][] C=new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j==M-1){
                    System.out.print(C[i][j]);
                }
                else {
                    System.out.print(C[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
