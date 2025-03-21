package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Queue<Integer> deck=new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deck.add(i);
        }
        while(deck.size()!=1){
            deck.remove();
            int ch=deck.remove();
            deck.add(ch);
        }
        System.out.print(deck.peek());
    }
}
