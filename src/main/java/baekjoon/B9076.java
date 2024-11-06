package baekjoon;
import java.util.*;
public class B9076 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int[] arr=new int[5];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 5; j++) {
                arr[j]=s.nextInt();
            }
            Arrays.sort(arr);

            if(arr[3]-arr[1]>=4){
                System.out.println("KIN");
            }
            else{
                System.out.println(arr[1]+arr[2]+arr[3]);
            }
        }
    }
}
