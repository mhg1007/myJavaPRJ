package baekjoon;
import java.util.Scanner;
public class B10103 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int A=100,B=100;
        for (int i = 0; i < n; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            if(a>b){
                B-=a;
            }
            else if(a<b){
                A-=b;
            }
        }
        System.out.print(A+"\n"+B);
    }
}
