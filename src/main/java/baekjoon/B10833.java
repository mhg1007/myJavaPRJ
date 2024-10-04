package baekjoon;
import java.util.Scanner;
public class B10833 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            sum+=b%a;
        }
        System.out.print(sum);
    }
}
