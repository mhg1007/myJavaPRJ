package baekjoon;
import java.util.*;
public class B2455 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr=new int[4];
        int tan=0;
        for (int i = 0; i < 4; i++) {
            int n=s.nextInt();
            int t=s.nextInt();
            tan=tan+t-n;
            arr[i]=tan;
        }
        Arrays.sort(arr);
        System.out.print(arr[3]);
    }
}
