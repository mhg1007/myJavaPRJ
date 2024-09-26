package baekjoon;
import java.util.Scanner;
public class B5565 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < 9; i++) {
            N-=s.nextInt();
        }
        System.out.print(N);
    }
}
