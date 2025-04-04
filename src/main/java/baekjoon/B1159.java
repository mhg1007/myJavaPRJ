package baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1159 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            String ss=s.next();
            char fst=ss.charAt(0);
            if(map.containsKey(fst)){
                int ov=map.get(fst);
                map.replace(fst,ov,ov+1);
            }
            else{
                map.put(fst,1);
            }
        }
        if(Collections.max(map.values())>=5){
            for(char a:map.keySet()){
                if(map.get(a)>=5){
                    System.out.print(a);
                }
            }
        }
        else{
            System.out.print("PREDAJA");
        }
    }
}
