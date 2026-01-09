package baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B17388 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S=s.nextInt();
        int K=s.nextInt();
        int H=s.nextInt();
        Map<Integer,String> map=new HashMap<>();
        map.put(S,"Soongsil");
        map.put(K,"Korea");
        map.put(H,"Hanyang");
        System.out.print(S+K+H>=100?"OK":map.get(Collections.min(map.keySet())));
    }
}
