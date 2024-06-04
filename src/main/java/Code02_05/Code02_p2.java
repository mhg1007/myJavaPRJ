package Code02_05;

import java.util.Scanner;

public class Code02_p2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a,n,d,mid,res;

        System.out.println("첫번째 항 a:");
        a=s.nextInt();

        System.out.println("공차 d:");
        d=s.nextInt();

        System.out.println("몇번째 항까지 (n):");
        n=s.nextInt();

        mid=((n-1)*d)+(a*2);
        res=mid*n/2;
                System.out.println("n번째 항까지의 총합:"+res);
        s.close();
    }
}
