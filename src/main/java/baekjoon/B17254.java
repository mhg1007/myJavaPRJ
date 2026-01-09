package baekjoon;

import java.util.*;

public class B17254 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        List<String> list=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            String c=s.next();

            String seq=b+" "+a;
            list.add(seq);
            map.put(seq,c);
        }
        list.sort((o1, o2) -> {
            int o1b = Integer.parseInt(o1.substring(0, o1.indexOf(" ")));
            int o2b = Integer.parseInt(o2.substring(0, o2.indexOf(" ")));
            if (o1b==o2b) {
                int o1a = Integer.parseInt(o1.substring(o1.indexOf(" ")+1));
                int o2a = Integer.parseInt(o2.substring(o2.indexOf(" ")+1));
                return o1a-o2a;
            }
            return o1b-o2b;
        });
        StringBuilder sb = new StringBuilder();
        for(String a:list){
            sb.append(map.get(a));
        }
        System.out.print(sb);
    }
}
