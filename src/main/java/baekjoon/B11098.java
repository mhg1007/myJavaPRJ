package baekjoon;

import java.util.*;

public class B11098 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            int p=s.nextInt();
            Map<Integer,String> map=new HashMap<>();
            for (int j = 0; j < p; j++) {
                int C=s.nextInt();
                String nm=s.next();
                map.put(C,nm);
            }
            System.out.println(map.get(Collections.max(map.keySet())));
        }
    }
}
