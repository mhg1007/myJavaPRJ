package baekjoon;

import java.util.Scanner;

public class B17945 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt()*2;
        int B=s.nextInt();
        double r=Math.sqrt(A*A-B*4);
        int x1=(int)-(A+r)/2;
        int x2=(int)-(A-r)/2;
        System.out.print(x1==x2?x1:x1+" "+x2);
    }
}
