package baekjoon;
import java.util.Scanner;
public class B2720 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int C=s.nextInt();
            int q=C/25;
            int d=C%25/10;
            int n=C%25%10/5;
            int p=C%25%10%5;
            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}
