package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B21734 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char c=(char)(i+97);
            int nm=i+97;
            int sq=0;
            while(nm>0){
                sq+=nm%10;
                nm/=10;
            }
            map.put(c,sq);
        }
        String str=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            sb.append(String.valueOf(c).repeat(map.get(c))).append("\n");
        }
        System.out.print(sb);
    }
}
