package baekjoon;
import java.util.Scanner;
public class B11721 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int len=str.length();
        int m=len/10;
        int n=len%10;
        for (int i = 0; i < m; i++) {
            System.out.println(str.substring(i*10,(i+1)*10));
        }
        if(n!=0){
            System.out.print(str.substring(str.length()-n));
        }
    }
}
