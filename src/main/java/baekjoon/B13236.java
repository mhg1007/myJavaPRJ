package baekjoon;

import java.util.Scanner;

public class B13236 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n!=1){
            sb.append(n).append(" ");
            if(n%2==0){
                n/=2;
            }
            else {
                n=n*3+1;
            }
        }
        sb.append(1);
        System.out.print(sb);
    }
}
