package baekjoon;
import java.util.Scanner;
public class B5086 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a<b && b%a==0){
                System.out.println("factor");
            }
            else if(a>b && a%b==0){
                System.out.println("multiple");
            }
            else if(a==0 && b==0){
                break;
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
