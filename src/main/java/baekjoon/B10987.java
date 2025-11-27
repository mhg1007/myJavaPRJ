package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B10987 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a =s.next();
        int cnt =0;
        List<Character> l=List.of('a','e','i','o','u');
        for (int i = 0; i < a.length(); i++) {
            if (l.contains(a.charAt(i))) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
