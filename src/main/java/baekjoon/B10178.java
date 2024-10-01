package baekjoon;
import java.util.Scanner;
public class B10178 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int c=s.nextInt();
            int v=s.nextInt();
            System.out.println("You get "+(c/v)+" piece(s) and your dad gets "+(c%v)+" piece(s).");
        }
    }
}
