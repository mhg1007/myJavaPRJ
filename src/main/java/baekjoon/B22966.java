package baekjoon;

import java.util.*;

public class B22966 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(s.next(),s.nextInt());
        }
        for(String a:map.keySet()){
            if(Objects.equals(map.get(a), Collections.min(map.values()))){
                System.out.print(a);
                break;
            }
        }
    }
}
