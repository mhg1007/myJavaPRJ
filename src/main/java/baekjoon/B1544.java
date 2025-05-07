package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1544 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Set<String> set=new HashSet<>();
        set.add(s.next());
        for (int i = 1; i < N; i++) {
            String str=s.next();
            String sts=str;
            boolean flag=false;
            for (int j = 0; j < str.length(); j++) {
                char c=sts.charAt(0);
                sts=sts.replaceFirst(String.valueOf(c),"")+c;
                if(set.contains(sts)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                set.add(str);
            }
        }
        System.out.print(set.size());
    }
}
