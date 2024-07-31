package baekjoon;
import java.util.*;
public class B2750 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
