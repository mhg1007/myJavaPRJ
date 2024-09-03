package baekjoon;
import java.util.Scanner;
public class B2740 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[][] arr1=new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j]=s.nextInt();
            }
        }
        int M2=s.nextInt();
        int K=s.nextInt();
        int[][] arr2=new int[M2][K];
        for (int i = 0; i < M2; i++) {
            for (int j = 0; j < K; j++) {
                arr2[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                int arx=0;
                for (int k = 0; k < M2; k++) {
                    arx+=arr1[i][k]*arr2[k][j];
                }
                if(j==K-1){
                    System.out.println(arx);
                }
                else{
                    System.out.print(arx+" ");
                }
            }
        }
    }
}
