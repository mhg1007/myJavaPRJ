package baekjoon;

import java.util.Scanner;

public class B14584 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ecd=s.next();
        int N=s.nextInt();
        String[] dic=new String[N];
        for (int i = 0; i < N; i++) {
            dic[i]=s.next();
        }
        int pwd=0;
        dec:
        while(true){
            StringBuilder sb=new StringBuilder();
            pwd+=1;
            for (int i = 0; i < ecd.length(); i++) {
                char a=ecd.charAt(i);
                int b=a+pwd;
                if(b<97){
                    b+=26;
                }
                else if (b>122) {
                    b-=26;
                }
                sb.append((char)b);
            }
            String dcd=sb.toString();
            for(String d:dic){
                if(dcd.contains(d)){
                    System.out.print(dcd);
                    break dec;
                }
            }
        }
    }
}
