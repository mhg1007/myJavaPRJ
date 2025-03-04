package baekjoon;

import java.util.*;

public class B1205 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int ns=s.nextInt();
        int P=s.nextInt();
        if(N>0){
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(s.nextInt());
            }
            if(ns<=list.get(list.size()-1) && list.size()==P){
                System.out.print(-1);
            }
            else{
                list.add(ns);
                list.sort(Collections.reverseOrder());
                System.out.print(list.indexOf(ns)+1);
            }
        }
        else{
            System.out.print(1);
        }
    }
}
