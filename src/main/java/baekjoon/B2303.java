package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2303 {
    public static int mxc(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    list.add(sum%10);
                }
            }
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int[] arr2=new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i]=mxc(arr[i]);
        }
        int max=0;
        int idx=0;
        for (int i = 0; i < N; i++) {
            if (arr2[i]>=max) {
                max=arr2[i];
                if(i>idx){
                    idx=i;
                }
            }
        }
        System.out.print(idx+1);
    }
}
