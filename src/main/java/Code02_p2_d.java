import java.util.Scanner;

public class Code02_p2_d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a,n,d,mid;
        int res=0;

        System.out.print("첫번째 항 a:");
        a=s.nextInt();

        System.out.print("공차 d:");
        d=s.nextInt();

        System.out.print("몇번째 항까지 (n):");
        n=s.nextInt();

        for (mid=0; mid<n; mid++){
            res=res+a+(mid*d);
        }

        System.out.print("n번째 항까지의 총합:"+res);
        s.close();

    }
}
