package baekjoon;

import java.util.Scanner;

public class B17502 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String chd=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            if(chd.charAt(i)=='?'){
                char mrr=chd.charAt(N-1-i);
                sb.append(mrr!='?'?mrr:"a");
            }
            else{
                sb.append(chd.charAt(i));
            }
        }
        String md=(N%2==0? "" : chd.substring(N/2,N/2+1)).replace("?","a");
        System.out.print(sb.toString() + md + sb.reverse());
    }
}
