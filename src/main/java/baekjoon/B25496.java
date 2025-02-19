package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B25496 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int P=s.nextInt();
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < N; i++) {
            if(P>=200){
                break;
            }
            P+=arr[i];
            count++;
        }
        System.out.print(count);
    }
}
