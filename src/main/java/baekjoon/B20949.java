package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B20949 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<int[]> l=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int W=s.nextInt(),H=s.nextInt();
            l.add(new int[]{i+1,W*W+H*H});
        }
        l.sort((o1, o2) -> {
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o2[1]-o1[1];
        });
        for(int[] a:l){
            System.out.println(a[0]);
        }
    }
}
