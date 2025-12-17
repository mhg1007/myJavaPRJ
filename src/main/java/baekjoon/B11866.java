package baekjoon;

import java.util.*;

public class B11866 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i+1);
        }
        Queue<Integer> q=new LinkedList<>();
        int idx=K-1;
        while (list.size()>1) {
            q.add(list.get(idx));
            list.remove(idx);
            idx+=K-1;
            while(idx>=list.size()){
                idx-=list.size();
            }
        }
        q.add(list.get(0));
        StringBuilder sb=new StringBuilder("<");
        for(int a:q){
            sb.append(a).append(", ");
        }
        sb.setLength(sb.length()-2);
        sb.append(">");
        System.out.print(sb);
    }
}
