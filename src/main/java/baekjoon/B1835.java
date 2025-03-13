package baekjoon;

import java.util.*;

public class B1835 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Deque<Integer> deq=new ArrayDeque<>();
        deq.addFirst(N);
        for (int i = N-1; i > 0; i--) {
            deq.addFirst(i);
            for (int j = 0; j < i; j++) {
                int a=deq.removeLast();
                deq.addFirst(a);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int a:deq){
            sb.append(a).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
