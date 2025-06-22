package baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2495 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String n=s.next();
            Map<Character,Integer> map=new HashMap<>();
            int ln=1;
            for (int j = 0; j < n.length()-1; j++) {
                if(n.charAt(j)==n.charAt(j+1)){
                    ln++;
                }
                else{
                    ln=1;
                }
                if(map.getOrDefault(n.charAt(j),0)<ln){
                    map.put(n.charAt(j),ln);
                }
            }
            System.out.println(Collections.max(map.values()));
        }
    }
}
