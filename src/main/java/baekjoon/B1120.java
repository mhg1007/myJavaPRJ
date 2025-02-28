package baekjoon;

import java.util.*;

public class B1120 {
    public static int dfrc(String a, String b){
        int cnt=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        if(A.length()==B.length()){
            System.out.print(dfrc(A,B));
        }
        else{
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <= B.length()-A.length(); i++) {
                String bc=B.substring(i,i+A.length());
                list.add(dfrc(A,bc));
            }
            System.out.print(Collections.min(list));
        }
    }
}
