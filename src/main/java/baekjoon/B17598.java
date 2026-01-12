package baekjoon;

import java.util.Scanner;

public class B17598 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] cdd={"Tiger","Lion"};
        int[] vote={0,0};
        for (int i = 0; i < 9; i++) {
            String a=s.next();
            if(a.equals(cdd[0])){
                vote[0]++;
            }
            else if(a.equals(cdd[1])){
                vote[1]++;
            }
        }
        if(vote[0]>vote[1]){
            System.out.print(cdd[0]);
        }
        else if (vote[0]<vote[1]) {
            System.out.print(cdd[1]);
        }
    }
}
