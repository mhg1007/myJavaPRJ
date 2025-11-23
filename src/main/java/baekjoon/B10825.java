package baekjoon;

import java.util.*;

public class B10825 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        Map<String,int[]> map=new HashMap<>();
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String nm=s.next();
            int[] scr={s.nextInt(),s.nextInt(),s.nextInt()};
            list.add(nm);
            map.put(nm,scr);
        }
        list.sort((o1, o2) -> {
            int[] a1=map.get(o1),a2=map.get(o2);
            if(a1[0]!=a2[0]){
                return a2[0]-a1[0];
            }
            else if(a1[1]!=a2[1]){
                return a1[1]-a2[1];
            }
            else if(a1[2]!=a2[2]){
                return a2[2]-a1[2];
            }
            return o1.compareTo(o2);
        });
        for(String nm:list){
            System.out.println(nm);
        }
    }
}
