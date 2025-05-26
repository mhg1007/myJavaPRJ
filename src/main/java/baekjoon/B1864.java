package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B1864 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>(Arrays.asList('-','\\','(','@','?','>','&','%'));
        while (true){
            String str=s.next();
            if(str.equals("#")) break;
            long sum=0L;
            for (int i = 0; i < str.length(); i++) {
                sum+=list.indexOf(str.charAt(i))*(long)Math.pow(8,str.length()-1-i);
            }
            System.out.println(sum);
        }
    }
}
