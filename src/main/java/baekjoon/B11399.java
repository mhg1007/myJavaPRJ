package baekjoon;
import java.util.*;
public class B11399 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i = N-1; i >=0; i--) {
            sum+=arr[i]*(N-i);
        }
        System.out.print(sum);
    }
}
