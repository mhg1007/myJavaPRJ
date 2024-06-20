package baekjoon;
import java.util.Scanner;
public class B2581 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int sum=0;
        int min=0;
        for (int i = M; i <= N; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                if(sum==0){
                    min=i;
                }
                sum+=i;
            }
        }
        if(sum!=0) {
            System.out.print(sum + "\n" + min);
        }
        else{
            System.out.print(-1);
        }
    }
}
