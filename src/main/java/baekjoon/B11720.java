package baekjoon;
import java.util.Scanner;
public class B11720 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String S=s.next();
        int r=0;
        for(int i=0;i<N;i++){
            r+=Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        System.out.print(r);
    }
}
