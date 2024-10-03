package baekjoon;
import java.util.Scanner;
public class B10569 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int V=s.nextInt();
            int E=s.nextInt();
            System.out.println(2-V+E);
        }
    }
}
