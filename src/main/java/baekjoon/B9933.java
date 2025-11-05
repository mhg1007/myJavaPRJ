package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B9933 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(s.next());
        }
        for(String a:set){
            StringBuilder sb=new StringBuilder();
            sb.append(a);
            sb.reverse();
            if(set.contains(sb.toString())){
                System.out.print(a.length()+" "+a.charAt(a.length()/2));
                break;
            }
        }
    }
}
