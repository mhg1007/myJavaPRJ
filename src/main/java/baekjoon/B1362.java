package baekjoon;

import java.util.Scanner;

public class B1362 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=0;
        while(true){
            int o=s.nextInt();
            int w=s.nextInt();
            if(o==0 && w==0) break;
            seq++;
            boolean chk=true;
            while(true){
                String act=s.next();
                int n=s.nextInt();
                if(act.equals("#") && n==0) break;
                if(act.equals("E")){
                    w-=n;
                }
                else if(act.equals("F")){
                    w+=n;
                }
                if(w<=0){
                    chk=false;
                }
            }
            String stt="";
            if(w<=0 || !chk){
                stt="RIP";
            }
            else if(w>o/2.0 && w<o*2){
                stt=":-)";
            }
            else{
                stt=":-(";
            }
            System.out.printf("%d %s\n",seq,stt);
        }
    }
}
