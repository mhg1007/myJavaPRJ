package baekjoon;

import java.util.Scanner;

public class B16479 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        int D1=s.nextInt();
        int D2=s.nextInt();
        if(D1%D2==0){
            System.out.println(K*K-Math.pow((D1/D2-1)*D2/2.0,2));
        }
        else{
            System.out.print(K*K-Math.pow((D1-D2)/2.0,2));
        }
    }
}
