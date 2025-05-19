package baekjoon;

import java.util.Scanner;

public class B1769 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x=s.next();
        int cnt=0;
        while(x.length()>1){
            long sum=0;
            for (int i = 0; i < x.length(); i++) {
                sum+=Character.getNumericValue(x.charAt(i));
            }
            cnt++;
            x=String.valueOf(sum);
        }
        int res=Integer.parseInt(x);
        System.out.print(cnt+"\n"+(res%3==0?"YES":"NO"));
    }
}
