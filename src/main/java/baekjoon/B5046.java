package baekjoon;

import java.util.*;

public class B5046 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int B=s.nextInt();
        int H=s.nextInt();
        int W=s.nextInt();
        int[][] har=new int[H][W+1];
        for (int i = 0; i < H; i++) {
            har[i][0]=s.nextInt();
            for (int j = 1; j <= W; j++) {
                har[i][j]=s.nextInt();
            }
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <= W; i++) {
            for (int j = 0; j < H; j++) {
                int prc=har[j][0]*N;
                if(har[j][i]>=N){
                    if(prc<=B){
                        list.add(prc);
                    }
                }
            }
        }
        Collections.sort(list);
        System.out.print(list.isEmpty() ?"stay home":list.get(0));
    }
}
