package baekjoon;

import java.util.*;

public class B1371 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        while(s.hasNextLine()){
            String str=s.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                if(c!=' ') {
                    if (map.containsKey(c)) {
                        int ov = map.get(c);
                        map.replace(c, ov, ov + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }
        List<Character> list=new ArrayList<>();
        for(char c:map.keySet()){
            if(Objects.equals(map.get(c), Collections.max(map.values()))){
                list.add(c);
            }
        }
        Collections.sort(list);
        for(char c:list){
            System.out.print(c);
        }
    }
}
