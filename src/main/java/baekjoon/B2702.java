package baekjoon;
import java.util.Scanner;
public class B2702 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int A=0,B=0;
            for(int j=1;;j++){
                if (a%j==0 && b%j==0) {
                    B=j;
                }
                if(j%a==0 && j%b==0){
                    A=j;
                    break;
                }
            }
            System.out.println(A+" "+B);
        }
    }
}
