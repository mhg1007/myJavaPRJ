package baekjoon;

import java.util.Scanner;

public class B16727 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p1=s.nextInt();
        int s1=s.nextInt();
        int s2=s.nextInt();
        int p2=s.nextInt();
        int ps=p1+p2;
        int ss=s1+s2;
        if(ps==ss){
            if(s1!=p2){
                System.out.print(p2>s1?"Persepolis":"Esteghlal");
            }
            else{
                System.out.print("Penalty");
            }
        }
        else{
            System.out.print(ps>ss?"Persepolis":"Esteghlal");
        }
    }
}
