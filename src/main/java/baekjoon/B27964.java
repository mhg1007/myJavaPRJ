package baekjoon;

import java.util.*;

public class B27964 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Set<String> tps=new HashSet<>();
        for (int i = 0; i < N; i++) {
            String tp=s.next();
            if(tp.length()<6){
                continue;
            }
            String chch=tp.substring(tp.length()-6);
            if(Objects.equals(chch,"Cheese")){
                tps.add(tp);
            }
        }
        if(tps.size()>=4){
            System.out.print("yummy");
        }
        else{
            System.out.print("sad");
        }
    }
}
