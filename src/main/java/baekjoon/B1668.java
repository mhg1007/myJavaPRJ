package baekjoon;

import java.util.Scanner;

public class B1668 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        int cntl=1;
        for (int i = 0; i < N-1; i++) {
            if(arr[i]<arr[i+1] && arr[i+1]>max){
                max=arr[i+1];
                cntl++;
            }
        }
        max=arr[N-1];
        int cntr=1;
        for (int i = N-1; i > 0; i--) {
            if(arr[i]<arr[i-1] && arr[i-1]>max){
                max=arr[i-1];
                cntr++;
            }
        }
        System.out.print(cntl+"\n"+cntr);
    }
}
