package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2954 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> vw=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if(vw.contains(str.charAt(i))){
                i+=2;
            }
        }
        System.out.print(sb);
    }
}
