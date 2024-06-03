package baekjoon;
import java.util.Scanner;
public class B2566 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] num=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num[i][j]=s.nextInt();
            }
        }
        int max=num[0][0];
        int M=0;
        int N=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (num[i][j]>max){
                    max=num[i][j];
                    M=i;
                    N=j;
                }
            }
        }
        System.out.print(max+"\n"+(M+1)+" "+(N+1));
    }
}
