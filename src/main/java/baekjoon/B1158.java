package baekjoon;

import java.util.*;

public class B1158 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int pos=K-1;
        StringBuilder sb=new StringBuilder();
        sb.append("<");
        while(list.size()!=1){
            int nxt=list.get(pos);
            sb.append(nxt).append(", ");
            list.remove(pos);
            pos+=K-1;
            while(pos>=list.size()){
                pos-=list.size();
            }
        }
        sb.append(list.get(0)).append(">");
        System.out.print(sb);
    }
}
