package baekjoon;

import java.util.Scanner;

public class B17201 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String mgn=s.next();
        boolean chk=true;
        for (int i = 0; i < N*2-1; i++) {
            if(mgn.charAt(i)==mgn.charAt(i+1)){
                chk=false;
                break;
            }
        }
        System.out.print(chk?"Yes":"No");
    }
}
