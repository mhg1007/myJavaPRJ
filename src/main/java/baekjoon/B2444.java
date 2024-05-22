package baekjoon;
import java.util.Scanner;
public class B2444 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i=0; i<N; i++){
            for (int j=1; j<(N*2); j++) {
                if(j>(N-i-1)&&j<(N+i+1)){
                    System.out.print("*");
                }
                else if(j<(N-i)){
                    System.out.print(" ");
                }
            }
            if(N!=1) {
                System.out.println();
            }
        }
        for (int i = N-1; i >0 ; i--) {
            for (int j = 1; j <(N*2) ; j++) {
                if(j>(N-i)&&j<(N+i)){
                    System.out.print("*");
                }
                else if(j<(N-i+1)){
                    System.out.print(" ");
                }
            }
            if(i!=1) {
                System.out.println();
            }
        }
    }
}
