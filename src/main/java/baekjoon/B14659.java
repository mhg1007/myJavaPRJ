package baekjoon;

import java.util.Scanner;

public class B14659 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int max=0;
        int bst=0;
        for (int i = 0; i < N; i++) {
            int arc=arr[i];
            if(arc>bst){
                bst=arc;
            }
            else{
                continue;
            }
            int kl=0;
            for (int j = i+1; j < N; j++) {
                if(arr[i]>arr[j]){
                    kl++;
                }
                else if(arr[j]>arr[i]){
                    break;
                }
            }
            if(kl>max){
                max=kl;
            }
        }
        System.out.print(max);
    }
}
