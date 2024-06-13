package baekjoon;
import java.util.Scanner;
public class B2869 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int V=s.nextInt();

        double a=(V-A)/(double)(A-B);

        System.out.print((int)Math.ceil(a)+1);
    }
}
