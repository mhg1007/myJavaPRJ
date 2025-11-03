package baekjoon;

import java.util.*;

public class B9612 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word=s.next();
            if(map.containsKey(word)){
                map.replace(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        int mxv= Collections.max(map.values());
        List<String> list=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==mxv){
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(list.size()-1)+" "+mxv);
    }
}
