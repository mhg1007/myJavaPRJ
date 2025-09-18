package baekjoon;

import java.util.Scanner;

public class B5724 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int N=s.nextInt();
            if(N==0)break;
            int sum=0;
            for (int i = 1; i <= N; i++) {
                sum+=i*i;
            }
            System.out.println(sum);
        }
    }
}
