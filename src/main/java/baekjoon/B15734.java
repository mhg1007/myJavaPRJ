package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B15734 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        int R=s.nextInt();
        int A=s.nextInt();
        if(L==R){
            System.out.print((L+A/2)*2);
        }
        else{
            int mx=Math.max(L,R);
            int mn=Math.min(L,R);
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i <= A; i++) {
                list.add(Math.min(mn+i,mx+A-i)*2);
            }
            System.out.print(Collections.max(list));
        }
    }
}
