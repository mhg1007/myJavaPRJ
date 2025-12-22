package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B14425 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(s.next());
        }
        int chk=0;
        for (int i = 0; i < M; i++) {
            String str=s.next();
            if(set.contains(str)){
                chk++;
            }
        }
        System.out.print(chk);
    }
}
