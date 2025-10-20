package baekjoon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B9226 {
    public static String fglt(String org){
        String res=org;
        int idx=0;
        for (int i = 0; i < res.length(); i++) {
            if(Pattern.matches("[aeiou]",res.substring(i,i+1))){
                idx=i;
                break;
            }
        }
        res=res.substring(idx)+res.substring(0,idx);
        return res+"ay";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            String org=s.next();
            if(org.equals("#")) break;
            System.out.println(fglt(org));
        }
    }
}
