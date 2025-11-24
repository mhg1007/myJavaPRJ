package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B10828 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < N; i++) {
            String ord=s.next();
            switch (ord) {
                case "push":
                    int x = s.nextInt();
                    stack.push(x);
                    break;
                case "pop":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}
