package baekjoon;

import java.util.Scanner;

public class B4299 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int a=(x+y)/2;
        int b=(x-y)/2;
        if (a+b!=x||(a>b&&a-b!=y)||(a<b&&b-a!=y)||a<0||b<0||x>1000||y>1000||x<0||y<0) {
            System.out.print(-1);
        }
        else{
            System.out.println(Math.max(a,b)+" "+Math.min(a,b));
        }
    }
}
