package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B5704 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            String str=s.nextLine();
            if(str.equals("*")) break;
            Set<Character> set=new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            boolean chk=true;
            for (int i = 0; i < 26; i++) {
                if(!set.contains((char)(i+97))){
                    chk=false;
                    break;
                }
            }
            System.out.println(chk?"Y":"N");
        }
    }
}
