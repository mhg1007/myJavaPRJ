package baekjoon;
import java.util.Scanner;
public class B11653 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        while(N>=2){
            for (int i = 2; i <= N; i++) {
                if(N%i==0){
                    System.out.println(i);
                    N/=i;
                    break;
                }
            }
        }
    }
}
