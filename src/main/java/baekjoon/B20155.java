package baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B20155 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),M=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x=s.nextInt();
            if (map.containsKey(x)) {
                map.put(x,map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        System.out.print(Collections.max(map.values()));
    }
}
