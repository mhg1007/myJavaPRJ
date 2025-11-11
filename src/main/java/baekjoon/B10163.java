package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B10163 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[1001][1001];
        for (int i = 0; i < N; i++) {
            int x=s.nextInt();
            int y=s.nextInt();
            int l=s.nextInt();
            int h=s.nextInt();
            for (int j = x; j < x+l; j++) {
                for (int k = y; k < y+h; k++) {
                    arr[j][k]=i+1;
                }
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                int a=arr[i][j];
                if(a!=0) {
                    if (map.containsKey(a)) {
                        int ov = map.get(a);
                        map.replace(a, ov, ov + 1);
                    } else {
                        map.put(a, 1);
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(map.getOrDefault(i+1,0));
        }
    }
}
