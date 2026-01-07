package baekjoon;

import java.util.Scanner;

public class B15820 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        int s2=s.nextInt();

        int s1s=0;
        for (int i = 0; i < s1; i++) {
            int ca=s.nextInt();
            int a=s.nextInt();
            if(ca==a){
                s1s++;
            }
        }

        int s2s=0;
        for (int i = 0; i < s2; i++) {
            int ca=s.nextInt();
            int a=s.nextInt();
            if(ca==a){
                s2s++;
            }
        }

        String str;
        if(s1s==s1 && s2s==s2){
            str="Accepted";
        }
        else if(s1s!=s1){
            str="Wrong Answer";
        }
        else{
            str="Why Wrong!!!";
        }

        System.out.print(str);
    }
}
