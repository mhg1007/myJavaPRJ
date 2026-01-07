package baekjoon;

import java.util.*;

public class B16165 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        Map<String,String> map=new HashMap<>();
        Map<String, List<String>> map2=new HashMap<>();
        for (int i = 0; i < N; i++) {
            String grp=s.next();
            int mn=s.nextInt();
            List<String> list=new ArrayList<>();
            for (int j = 0; j < mn; j++) {
                String mb=s.next();
                list.add(mb);
                map.put(mb,grp);
            }
            Collections.sort(list);
            map2.put(grp,list);
        }
        for (int i = 0; i < M; i++) {
            String qz=s.next();
            int rle=s.nextInt();
            if(rle==0){
                for(String a:map2.get(qz)){
                    System.out.println(a);
                }
            }
            else if(rle==1){
                System.out.println(map.get(qz));
            }
        }
    }
}
