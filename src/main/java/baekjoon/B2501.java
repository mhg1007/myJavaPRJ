package baekjoon;
import java.util.Scanner;
public class B2501 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int[] arr=new int[N];
        int set=0;
        for (int i = 1; i <= N; i++) {
            if(N%i==0){
                arr[set]=i;
                set++;
            }
        }
        System.out.print(arr[K-1]);
    }
}
