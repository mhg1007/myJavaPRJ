package baekjoon;
import java.util.Scanner;
public class B10953 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            int a=Integer.parseInt(String.valueOf(str.charAt(0)));
            int b=Integer.parseInt(String.valueOf(str.charAt(2)));
            System.out.println(a+b);
        }
    }
}
