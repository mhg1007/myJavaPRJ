package baekjoon;

import java.util.*;

public class B10570 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            int V=s.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for (int j = 0; j < V; j++) {
                int S=s.nextInt();
                if(map.containsKey(S)){
                    int ov=map.get(S);
                    map.replace(S,ov,ov+1);
                }
                else{
                    map.put(S,1);
                }
            }
            List<Integer> list=new ArrayList<>();
            for(int a: map.keySet()){
                if(Objects.equals(map.get(a), Collections.max(map.values()))){
                    list.add(a);
                }
            }
            System.out.println(Collections.min(list));
        }
    }
}
