package baekjoon;
import java.util.Scanner;
public class B10996 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(j%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int j = 0; j < N; j++) {
                if(j%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
