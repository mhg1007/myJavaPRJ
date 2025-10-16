package baekjoon;

import java.util.Scanner;

public class B9012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String PS=s.next();
            while(PS.contains("()")){
                PS=PS.replace("()","");
            }
            if(PS.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
