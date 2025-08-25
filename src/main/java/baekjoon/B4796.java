package baekjoon;

import java.util.Scanner;

public class B4796 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cs=1;
        while(true) {
            int L = s.nextInt();
            int P = s.nextInt();
            int V = s.nextInt();
            if(L==0 && P==0 && V==0){
                break;
            }
            int sum = V/P*L;
            sum += Math.min(V%P, L);
            System.out.println("Case "+cs+": "+sum);
            cs++;
        }
    }
}
