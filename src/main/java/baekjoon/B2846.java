package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2846 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        int pos=0;
        List<Integer> list=new ArrayList<>();
        while(pos<N-1){
            int st=arr[pos];
            int pls=1;
            while(pos+pls<N){
                if(arr[pos+pls]>arr[pos+pls-1]) {
                    pls++;
                }
                else{
                    break;
                }
            }
            int ed=arr[pos+pls-1];
            list.add(ed-st);
            pos=pos+pls;
        }
        System.out.print(Collections.max(list));
    }
}
