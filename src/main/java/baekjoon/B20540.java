package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B20540 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] ar1={"E","S","T","J"};
        String[] ar2={"I","N","F","P"};
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(ar1[i],ar2[i]);
            map.put(ar2[i],ar1[i]);
        }
        String yg=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < yg.length(); i++) {
            sb.append(map.get(String.valueOf(yg.charAt(i))));
        }
        System.out.print(sb);
    }
}
