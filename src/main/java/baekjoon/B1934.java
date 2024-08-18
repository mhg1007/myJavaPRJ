package baekjoon;
import java.util.Scanner;
public class B1934 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int A=s.nextInt();
            int B=s.nextInt();
            int C=0;
            for (int j = 1; j <= Math.max(A,B); j++) {
                if(A%j==0&&B%j==0){
                    C=j;
                }
            }
            int D=A*B/C;
            System.out.println(D);
        }
    }
}
