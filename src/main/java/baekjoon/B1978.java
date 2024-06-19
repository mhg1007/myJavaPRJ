package baekjoon;
import java.util.Scanner;
public class B1978 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int ss=0;
        for (int i = 0; i < N; i++) {
            int n=s.nextInt();
            int count=0;
            for (int j = 1; j <= n; j++) {
                if(n%j==0){
                    count++;
                }
            }
            if(count==2){
                ss++;
            }
        }
        System.out.print(ss);
    }
}
