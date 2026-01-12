package baekjoon;

import java.util.*;

public class B18129 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next().toLowerCase();
        int K=s.nextInt();
        List<String> list=new ArrayList<>();
        int sdx=0,edx=1;
        while(edx<=S.length()-1){
            if(S.charAt(sdx)!=S.charAt(edx)){
                list.add(S.substring(sdx,edx));
                sdx=edx;
            }
            edx++;
        }
        list.add(S.substring(sdx));
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(String a:list){
            if(!set.contains(a.charAt(0))){
                sb.append(a.length()>=K?1:0);
                set.add(a.charAt(0));
            }
        }
        System.out.print(sb);
    }
}
