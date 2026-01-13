package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B18409 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String str=s.next();
        List<Character> l=List.of('a','e','i','o','u');
        int cnt=0;
        for (int i = 0; i < N; i++) {
            if(l.contains(str.charAt(i))){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
