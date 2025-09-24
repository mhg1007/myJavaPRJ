package baekjoon;

import java.util.Scanner;

public class B6159 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int S=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int cnt=0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i]+arr[j]<=S) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
