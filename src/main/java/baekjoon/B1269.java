package baekjoon;

import java.util.*;

public class B1269 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        Set<Integer> set=new HashSet<>();
        int db=0;
        for (int i = 0; i < a+b; i++) {
            int o=s.nextInt();
            if(set.contains(o)) db++;
            else set.add(o);
        }
        System.out.print(set.size()-db);
    }
}
