package baekjoon;

import java.util.Scanner;

public class B31496 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String S=s.next();
        int sum=0;
        for (int i = 0; i < n; i++) {
            String[] t=s.next().split("_");
            int e=s.nextInt();
            for(String a:t){
                if(a.equals(S)){
                    sum+=e;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
