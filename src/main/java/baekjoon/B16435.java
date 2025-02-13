package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B16435 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int L=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if(arr[i]<=L){
                L++;
            }
        }
        System.out.print(L);
    }
}
