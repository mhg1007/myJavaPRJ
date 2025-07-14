package baekjoon;

import java.util.Scanner;

public class B2845 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        int P=s.nextInt();
        int LP=L*P;
        for (int i = 0; i < 5; i++) {
            int np=s.nextInt();
            int sub=np-LP;
            if(i!=4) {
                System.out.print(sub+" ");
            }
            else{
                System.out.print(sub);
            }
        }
    }
}
