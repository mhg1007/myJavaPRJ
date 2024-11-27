package baekjoon;

import java.util.*;

public class B2309 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int n1=0,n2=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==j)
                    continue;
                if(sum-arr[i]-arr[j]==100){
                    n1=i;
                    n2=j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i!=n1&&i!=n2){
                System.out.println(arr[i]);
            }
        }
    }
}
