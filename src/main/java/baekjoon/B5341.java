package baekjoon;

import java.util.Scanner;

public class B5341 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            if(n==0)break;
            int sum=0;
            for (int i = 1; i <= n; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
