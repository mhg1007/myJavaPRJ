package baekjoon;
import java.util.Scanner;
public class B2445 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N*2; j++) {
                if(j>i&&j<N*2-i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = N-1; i > 0 ; i--) {
            for (int j = 0; j < N*2; j++) {
                if(j>i-1&&j<N*2-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
