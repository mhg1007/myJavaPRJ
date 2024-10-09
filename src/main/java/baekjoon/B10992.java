package baekjoon;
import java.util.Scanner;
public class B10992 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N+i; j++) {
                if(i==N-1){
                    System.out.print("*");
                }
                else{
                    if(j==N-i-1||j==N+i-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
