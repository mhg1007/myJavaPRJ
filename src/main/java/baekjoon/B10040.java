package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B10040 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] n=new int[N];
        for (int i = 0; i < N; i++) {
            n[i]=s.nextInt();
        }
        int[] scr=new int[N];
        for (int i = 0; i < M; i++) {
            int m=s.nextInt();
            for (int j = 0; j < N; j++) {
                if(n[j]<=m){
                    scr[j]++;
                    break;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int a:scr){
            list.add(a);
        }
        System.out.print(list.indexOf(Collections.max(list))+1);
    }
}
