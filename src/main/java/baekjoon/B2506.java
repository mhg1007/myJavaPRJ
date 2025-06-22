package baekjoon;

import java.util.Scanner;

public class B2506 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sum=0,pls=0;
        for (int i = 0; i < N; i++) {
            int ox=s.nextInt();
            if(ox==1){
                pls++;
                sum+=pls;
            }
            else if(ox==0){
                pls=0;
            }
        }
        System.out.print(sum);
    }
}
