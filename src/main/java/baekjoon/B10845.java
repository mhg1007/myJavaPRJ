package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B10845 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        int last=0;
        for (int i = 0; i < N; i++) {
            String ord=s.next();
            switch (ord){
                case "push":
                    int x=s.nextInt();
                    queue.add(x);
                    last=x;
                    break;
                case "pop":
                    System.out.println(queue.isEmpty()?-1:queue.remove());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty()?1:0);
                    break;
                case "front":
                    System.out.println(queue.isEmpty()?-1:queue.peek());
                    break;
                case "back":
                    System.out.println(queue.isEmpty()?-1:last);
                    break;
            }
        }
    }
}
