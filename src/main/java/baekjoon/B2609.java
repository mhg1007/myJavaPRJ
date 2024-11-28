package baekjoon;

import java.util.Scanner;

public class B2609 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int gcm=0;
        int lcm=0;
        for (int i = 1; i <= A*B; i++) {
            if(A%i==0&&B%i==0){
                gcm=i;
            }
            if(i%A==0&&i%B==0){
                lcm=i;
                break;
            }
        }
        System.out.print(gcm+"\n"+lcm);
    }
}
