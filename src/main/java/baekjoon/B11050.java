package baekjoon;
import java.util.Scanner;
public class B11050 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int r=fac(N)/(fac(N-K)*fac(K));
        System.out.print(r);
    }
    public static int fac(int x){
        int r=1;
        for (int i = x; i >=1 ; i--) {
            r*=i;
        }
        return r;
    }
}
