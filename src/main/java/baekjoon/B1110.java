package baekjoon;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int nc=N,count=0;
        while(true){
            nc=plcy(nc);
            count++;
            if(nc==N)
                break;
        }
        System.out.print(count);
    }
    public static int plcy(int n){
        int a=n/10;
        int b=n%10;
        return b*10 + (a+b)%10;
    }
}
