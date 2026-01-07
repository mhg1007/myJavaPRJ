package baekjoon;

import java.util.Scanner;

public class B15881 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),idx=0,cnt=0;
        String str=s.next(),set="pPAp";
        while(idx<n){
            idx=str.indexOf(set,idx);
            if(idx==-1)break;
            cnt++;
            idx+=4;
        }
        System.out.print(cnt);
    }
}
