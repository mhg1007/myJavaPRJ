package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum<=M){
                        list.add(sum);
                    }
                }
            }
        }
        System.out.print(Collections.max(list));
    }
}
