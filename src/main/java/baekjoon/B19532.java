package baekjoon;
import java.util.Scanner;
public class B19532 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        int f=s.nextInt();

        int x=0,y=0;
        for (int i = -999; i <= 999 ; i++) {
            for (int j = -999; j <= 999 ; j++) {
                if(a*i+b*j==c && d*i+e*j==f){
                    x=i;
                    y=j;
                }
            }
        }

        System.out.print(x+" "+y);
    }
}
