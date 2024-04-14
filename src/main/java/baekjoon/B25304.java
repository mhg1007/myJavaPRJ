package baekjoon;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rec=s.nextInt();
        int n=s.nextInt();
        int res=0;

        for(int i=1; i<=n; i++){
            int a=s.nextInt();
            int b=s.nextInt();
            res+=a*b;
        }

        if(res==rec) {
            System.out.print("Yes");
        }

        else{
            System.out.println("No");
        }

        s.close();
    }
}
