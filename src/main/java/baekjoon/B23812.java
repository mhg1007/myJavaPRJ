package baekjoon;
import java.util.Scanner;
public class B23812 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < 5; i++) {
            if(i%2==0){
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N*5; k++) {
                        if(k<N||k>=N*4){
                            System.out.print("@");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            else{
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N*5; k++) {
                        System.out.print("@");
                    }
                    System.out.println();
                }
            }
        }
    }
}
