package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1453 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Set<Integer> set=new HashSet<>();
        int rfs=0;
        for (int i = 0; i < N; i++) {
            int nxt=s.nextInt();
            if(set.contains(nxt)){
                rfs++;
            }
            else{
                set.add(nxt);
            }
        }
        System.out.print(rfs);
    }
}
