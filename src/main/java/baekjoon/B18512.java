package baekjoon;

import java.util.Scanner;

public class B18512 {
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int p1=s.nextInt();
        int p2=s.nextInt();
        int bg=Math.max(p1,p2);
        int sm=Math.min(p1,p2);
        if(X==Y){
            System.out.print((bg-sm)%X==0?bg:-1);
        }
        else{
            int gcd=gcd(X,Y);
            if((bg-sm)%gcd==0){
                int seq=0;
                while(true){
                    int nxt=p1+X*seq-p2;
                    if(nxt%Y==0){
                        break;
                    }
                    seq++;
                }
                System.out.print(p1+X*seq);
            }
            else{
                System.out.print(-1);
            }
        }
    }
}
