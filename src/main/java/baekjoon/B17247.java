package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B17247 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[][] arr=new int[N][M];
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j]=s.nextInt();
                if(arr[i][j]==1){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(Math.abs(list.get(0)-list.get(2))+Math.abs(list.get(1)-list.get(3)));
    }
}
