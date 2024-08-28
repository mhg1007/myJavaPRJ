package baekjoon;
import java.util.*;
public class B1037 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        if(N==1){
            System.out.print(arr[0]*arr[0]);
        }
        else{
            Arrays.sort(arr);
            System.out.print(arr[0]*arr[N-1]);
        }
    }
}
