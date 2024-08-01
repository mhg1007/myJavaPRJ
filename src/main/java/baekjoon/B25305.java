package baekjoon;
import java.util.*;
public class B25305 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        int k=s.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[N-k]);
    }
}
