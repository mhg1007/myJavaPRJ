package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B17608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < N; i++) {
            stack.add(s.nextInt());
        }
        int max=0;
        int sum=0;
        for (int i = 0; i < N; i++) {
            int nxt=stack.pop();
            if(nxt>max){
                max=nxt;
                sum++;
            }
        }
        System.out.print(sum);
    }
}
