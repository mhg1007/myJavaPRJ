package baekjoon;

import java.util.Scanner;

public class B13419 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String str=s.next();
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            if(str.length()==1){
                sb1.append(str);
                sb2.append(str);
            }
            else{
                int pos1=0;
                int pos2=1;
                while(true){
                    char c1=str.charAt(pos1);
                    char c2=str.charAt(pos2);
                    if(sb1.length()!=0 && sb1.charAt(0)==c1){
                        break;
                    }
                    sb1.append(c1);
                    sb2.append(c2);
                    pos1+=2;
                    pos2+=2;
                    if(pos1>=str.length()){
                        pos1-=str.length();
                    }
                    if(pos2>=str.length()){
                        pos2-=str.length();
                    }
                }
            }
            System.out.println(sb1+"\n"+sb2);
        }
    }
}
