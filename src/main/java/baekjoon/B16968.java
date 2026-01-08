package baekjoon;

import java.util.Scanner;

public class B16968 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String nb= s.next();
        int cnt=1,dub;
        for (int i = 0; i < nb.length(); i++) {
            char c = nb.charAt(i);
            int wgt=c=='c'?26:10;
            if(i!=0 && c==nb.charAt(i-1)){
                dub=1;
            }
            else{
                dub=0;
            }
            cnt*=wgt-dub;
        }
        System.out.print(cnt);
    }
}
