package baekjoon;
import java.util.Scanner;
public class B2442 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N+i; j++) {
                if(j<N-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
