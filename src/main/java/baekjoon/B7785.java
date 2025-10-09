package baekjoon;

import java.util.*;

public class B7785 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.next(), s.next());
        }
        List<String> list=new ArrayList<>();
        for(String a:map.keySet()){
            if(map.get(a).equals("enter")){
                list.add(a);
            }
        }
        Collections.sort(list);
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
