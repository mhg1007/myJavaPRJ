package baekjoon;
import java.util.Scanner;
public class B1085 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int w=s.nextInt();
        int h=s.nextInt();
        int xl=w-x;
        int yl=h-y;
        if(xl>x){
            xl=x;
        }
        if(yl>y){
            yl=y;
        }
        System.out.print(Math.min(xl, yl));
    }
}
