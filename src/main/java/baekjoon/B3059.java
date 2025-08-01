package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B3059 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int sum=2015;   // 26*(65+90)/2
            String S=s.next();
            Set<Character> set=new HashSet<>();
            char[] arr=S.toCharArray();
            for (char c:arr){
                set.add(c);
            }
            for(char c:set){
                sum-=c;
            }
            System.out.println(sum);
        }
    }
}
