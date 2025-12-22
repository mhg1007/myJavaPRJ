package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B18870 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] x=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=s.nextInt();
        }
        int[] y=x.clone();
        Arrays.sort(y);
        Map<Integer,Integer> map=new HashMap<>();
        int r=0;
        for(int v:y){
            if(!map.containsKey(v)){
                map.put(v,r++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int v:x) {
            sb.append(map.get(v)).append(" ");
        }
        System.out.print(sb);
    }
}
