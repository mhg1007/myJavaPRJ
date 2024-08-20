package baekjoon;
import java.util.Scanner;
public class B13241 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long A=s.nextLong();
        long B=s.nextLong();
        long gcm=0;
        for (long i = 1; i <= Math.min(A,B); i++) {
            if(A%i==0&&B%i==0){
                gcm=i;
            }
        }
        System.out.print(A*B/gcm);
    }
}
