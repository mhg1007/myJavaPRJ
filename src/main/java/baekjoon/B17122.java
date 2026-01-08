package baekjoon;

import java.util.Scanner;

public class B17122 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String p1=s.next();
            int p2=s.nextInt();
            boolean c1=(int)p1.charAt(0)%2!=0;
            boolean c2=Integer.parseInt(p1.substring(1))%2!=0;
            boolean c3=(p2-1)/8%2==0;
            boolean c4=p2%2!=0;
            if((c3&&c4)||(!c3&&!c4)){
                System.out.println((c1&&c2)||(!c1&&!c2)?"YES":"NO");
            }
            else {
                System.out.println((!c1&&c2)||(c1&&!c2)?"YES":"NO");
            }
        }
    }
}
