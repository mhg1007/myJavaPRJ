package baekjoon;
import java.util.Scanner;
public class B10872 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        System.out.print(fact(N));
    }
    public static long fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
