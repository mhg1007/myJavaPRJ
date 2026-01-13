package baekjoon;

import java.util.*;

public class B20113 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(i+1, 0);
        }
        for (int i = 0; i < N; i++) {
            int x=s.nextInt();
            if(x!=0){
                int ov=map.get(x);
                map.replace(x,ov,ov+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int a:map.keySet()){
            if(Objects.equals(map.get(a),Collections.max(map.values()))){
                list.add(a);
            }
        }
        System.out.print(list.size()==1?list.get(0):"skipped");
    }
}
