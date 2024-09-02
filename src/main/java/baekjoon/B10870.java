package baekjoon;
import java.util.Scanner;
public class B10870 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        System.out.print(fibo(N));
    }
    public static long fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
