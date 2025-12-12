package baekjoon;

import java.util.*;

public class B11587 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        int[] arr={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        char c='a';
        for (int j : arr) {
            map.put(c, j);
            c++;
        }
        int T=s.nextInt();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String str = s.next();
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                sb.append(map.get(str.charAt(j)));
            }
            list.add(sb.toString());
        }
        String S=s.next();
        int cnt=0;
        for(String a:list){
            if(a.equals(S)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
