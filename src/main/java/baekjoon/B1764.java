package baekjoon;

import java.util.*;

public class B1764 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(s.next());
        }
        List<String> list=new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String lsn=s.next();
            if(set.contains(lsn)){
                list.add(lsn);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
