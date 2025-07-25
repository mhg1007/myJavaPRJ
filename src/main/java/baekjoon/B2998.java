package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2998 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < 8; i++) {
            String oct=Integer.toBinaryString(i);
            while (oct.length() < 3) {
                oct="0"+oct;
            }
            map.put(oct,String.valueOf(i));
        }
        String bin=s.next();
        while(bin.length()%3!=0){
            bin="0"+bin;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < bin.length(); i+=3) {
            String bto=bin.substring(i,i+3);
            sb.append(map.get(bto));
        }
        System.out.print(sb);
    }
}
