package baekjoon;
import java.util.Scanner;
public class B2914 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int I=s.nextInt();
        double minI=I-0.99;
        System.out.print((int)Math.ceil(minI*A));
    }
}
