package baekjoon;

import java.util.Scanner;

public class B23027 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        if(S.contains("A")){
            S=S.replace("B","A");
            S=S.replace("C","A");
            S=S.replace("D","A");
            S=S.replace("F","A");
        }
        else{
            if(S.contains("B")){
                S=S.replace("C","B");
                S=S.replace("D","B");
                S=S.replace("F","B");
            }
            else{
                if(S.contains("C")){
                    S=S.replace("D","C");
                    S=S.replace("F","C");
                }
                else {
                    int l=S.length();
                    String ss="";
                    for (int i = 0; i < l; i++) {
                        ss+="A";
                    }
                    S=ss;
                }
            }
        }
        System.out.print(S);
    }
}
