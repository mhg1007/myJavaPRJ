package baekjoon;

import java.util.Scanner;

public class B11557 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            String[] arr1=new String[N];
            int[] arr2=new int[N];
            for (int j = 0; j < N; j++) {
                arr1[j]=s.next();
                arr2[j]=s.nextInt();
            }
            int max=arr2[0];
            int point=0;
            for (int j = 1; j < N; j++) {
                if(arr2[j]>max){
                    max=arr2[j];
                    point=j;
                }
            }
            System.out.println(arr1[point]);
        }
    }
}
