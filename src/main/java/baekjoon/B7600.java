package baekjoon;

import java.util.*;

public class B7600 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+97));
        }
        while(true){
            String ln=s.nextLine().toLowerCase();
            if(ln.equals("#")) break;
            Set<Character> set=new HashSet<>();
            for (int i = 0; i < ln.length(); i++) {
                char c=ln.charAt(i);
                if(list.contains(c)){
                    set.add(c);
                }
            }
            System.out.println(set.size());
        }
    }
}
