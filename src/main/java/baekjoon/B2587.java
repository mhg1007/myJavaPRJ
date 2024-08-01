package baekjoon;
import java.util.*;

public class B2587 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        int avg=sum/5;
        Arrays.sort(arr);
        System.out.print(avg+"\n"+arr[2]);
    }
}
