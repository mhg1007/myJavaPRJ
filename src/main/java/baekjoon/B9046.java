package baekjoon;

import java.util.*;

public class B9046 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        String fk= s.nextLine();
        for (int i = 0; i < T; i++) {
            String[] cp=s.nextLine().split(" ");
            Map<Character,Integer> map=new HashMap<>();
            for (String a : cp) {
                for (int k = 0; k < a.length(); k++) {
                    if (map.containsKey(a.charAt(k))) {
                        int ov = map.get(a.charAt(k));
                        map.replace(a.charAt(k), ov, ov + 1);
                    } else {
                        map.put(a.charAt(k), 1);
                    }
                }
            }
            List<Character> list=new ArrayList<>();
            for(char a : map.keySet()) {
                if(map.get(a).equals(Collections.max(map.values()))) {
                    list.add(a);
                }
            }
            System.out.println(list.size()==1?list.get(0):"?");
        }
    }
}
