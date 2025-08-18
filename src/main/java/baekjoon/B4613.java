package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B4613 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+65));
        }
        while(true){
            String str=s.nextLine();
            if(str.equals("#")) break;
            int sum=0;
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                if(c!=' '){
                    sum+=(i+1)*(list.indexOf(c)+1);
                }
            }
            System.out.println(sum);
        }
    }
}
