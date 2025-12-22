package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B17269 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] r={3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1};
        int n=s.nextInt(),m=s.nextInt();
        String a=s.next(),b=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < Math.max(n,m); i++) {
            if(i<n)sb.append(a.charAt(i));
            if(i<m)sb.append(b.charAt(i));
        }
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            l.add(r[sb.charAt(i)-65]);
        }
        while(l.size()>2){
            List<Integer> l2=new ArrayList<>();
            for (int i = 0; i < l.size()-1; i++) {
                l2.add((l.get(i)+l.get(i+1))%10);
            }
            l=l2;
        }
        System.out.print((l.get(0)==0?"":l.get(0))+""+l.get(1)+"%");
    }
}
