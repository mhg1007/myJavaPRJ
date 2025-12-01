package baekjoon;

import java.util.*;

public class B11091 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+97));
        }
        int N=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < N; i++) {
            String ln=s.nextLine().toLowerCase();
            Set<Character> set=new HashSet<>();
            for (int j = 0; j < ln.length(); j++) {
                char c=ln.charAt(j);
                if(list.contains(c)){
                    set.add(c);
                }
            }
            StringBuilder sb=new StringBuilder();
            if(set.size()==26){
                sb.append("pangram");
            }
            else{
                sb.append("missing ");
                for(char a:list){
                    if(!set.contains(a)){
                        sb.append(a);
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
