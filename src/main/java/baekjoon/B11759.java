package baekjoon;

import java.util.Scanner;

public class B11759 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int v1=s.nextInt();
        int v2=s.nextInt();
        String answer="Impossible";
        int il=S/v1;
        int jl=S/v2;
        brtfc:
        for (int i = il; i >= 0; i--) {
            for (int j = 0; j <= jl; j++) {
                if(v1*i+v2*j==S){
                    answer=i+" "+j;
                    break brtfc;
                }
            }
        }
        System.out.print(answer);
    }
}
