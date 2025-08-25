package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B4821 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int pg=s.nextInt();
            if(pg==0)break;
            String[] pgs=s.next().split(",");
            Set<Integer> set=new HashSet<>();
            for(String a:pgs){
                if(a.contains("-")){
                    int idx=a.indexOf("-");
                    int stt=Integer.parseInt(a.substring(0,idx));
                    int end=Integer.parseInt(a.substring(idx+1));
                    if(end>pg){
                        end=pg;
                    }
                    for (int i = stt; i <= end; i++) {
                        set.add(i);
                    }
                }
                else{
                    int stt=Integer.parseInt(a);
                    if(stt<=pg){
                        set.add(Integer.parseInt(a));
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}
