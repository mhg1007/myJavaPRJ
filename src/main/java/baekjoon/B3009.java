package baekjoon;
import java.util.Scanner;
public class B3009 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int y1=s.nextInt();

        int x2=s.nextInt();
        int y2=s.nextInt();

        int x3=s.nextInt();
        int y3=s.nextInt();

        if(x1==x2){
            System.out.print(x3);
        }
        else if(x2==x3){
            System.out.print(x1);
        }
        else{
            System.out.print(x2);
        }
        System.out.print(" ");
        if(y1==y2){
            System.out.print(y3);
        }
        else if(y2==y3){
            System.out.print(y1);
        }
        else{
            System.out.print(y2);
        }
    }
}
