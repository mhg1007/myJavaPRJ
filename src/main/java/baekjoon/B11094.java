package baekjoon;

import java.util.Scanner;

public class B11094 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String ss="Simon says";
        s.nextLine();
        for (int i = 0; i < N; i++) {
            String ln=s.nextLine();
            if(ln.contains(ss)){
                System.out.println(ln.substring(ln.indexOf(ss)+ss.length()));
            }
        }
    }
}
