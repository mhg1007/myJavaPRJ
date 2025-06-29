package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2703 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+65));
        }
        int T=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < T; i++) {
            String org=s.nextLine();
            String rule=s.nextLine();
            List<Character> list2=new ArrayList<>();
            for (int j = 0; j < rule.length(); j++) {
                list2.add(rule.charAt(j));
            }
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < org.length(); j++) {
                char c=org.charAt(j);
                if(c!=' '){
                    c=list2.get(list.indexOf(c));
                }
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
