package baekjoon;
import java.util.*;
public class B2997 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int[] sub=new int[2];
        for (int i = 0; i < 2; i++) {
            sub[i]=arr[i+1]-arr[i];
        }
        if(sub[0]>sub[1]){
            System.out.print((arr[0]+arr[1])/2);
        }
        else if(sub[0]==sub[1]){
            System.out.print(arr[2]+sub[0]);
        }
        else{
            System.out.print((arr[1]+arr[2])/2);
        }
    }
}
