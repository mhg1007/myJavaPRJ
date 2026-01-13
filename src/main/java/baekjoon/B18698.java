package baekjoon;

import java.util.Scanner;

public class B18698 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String wlk=s.next();
            int stp=0;
            for (int j = 0; j < wlk.length(); j++) {
                if(wlk.charAt(j)=='U'){
                    stp++;
                }
                else{
                    break;
                }
            }
            System.out.println(stp);
        }
    }
}
