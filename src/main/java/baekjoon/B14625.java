package baekjoon;

import java.util.Scanner;

public class B14625 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sh=s.nextInt();
        int sm=s.nextInt();
        int eh=s.nextInt();
        int em=s.nextInt();
        String N=s.next();
        int cnt=0;
        while(true){
            String tm=(sh>9?String.valueOf(sh):"0"+sh)+(sm>9?String.valueOf(sm):"0"+sm);
            if(tm.contains(N)){
                cnt++;
            }
            sm++;
            if(sh==eh && sm==em+1) break;
            if(sm==60){
                sm-=60;
                sh+=1;
            }
        }
        System.out.print(cnt);
    }
}
