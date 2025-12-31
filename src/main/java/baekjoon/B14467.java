package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B14467 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        int crs=0;
        for (int i = 0; i < N; i++) {
            int cn=s.nextInt();
            int rd=s.nextInt();
            if(map.containsKey(cn) && map.get(cn)!=rd){
                crs++;
            }
            map.put(cn,rd);
        }
        System.out.print(crs);
    }
}
