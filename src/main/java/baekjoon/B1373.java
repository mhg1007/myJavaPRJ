package baekjoon;

import java.util.Scanner;

public class B1373 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.length()%3!=0){
            while(str.length()%3!=0){
                str="0"+str;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i+=3) {
            String chg=str.substring(i,i+3);
            int n=Integer.parseInt(chg,2);
            sb.append(Integer.toOctalString(n));
        }
        System.out.print(sb);
    }
}
