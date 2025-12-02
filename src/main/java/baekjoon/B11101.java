package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B11101 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            Map<String,Integer> map=new HashMap<>();
            for(String a:s.next().split(",")){
                int idx=a.indexOf(":");
                String tl=a.substring(0,idx);
                int val=Integer.parseInt(a.substring(idx+1));
                map.put(tl,val);
            }
            int min=1000;
            for(String a:s.next().split("\\|")){
                int max=0;
                for(String b:a.split("&")){
                    max=Math.max(max,map.get(b));
                }
                min=Math.min(min,max);
            }
            System.out.println(min);
        }
    }
}
