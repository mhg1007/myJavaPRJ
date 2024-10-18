package baekjoon;
import java.util.Scanner;
public class B1075 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int F=s.nextInt();
        int cn=N/100*100;
        while(cn%F!=0){
            cn++;
        }
        int l=String.valueOf(cn).length();
        System.out.println(String.valueOf(cn).substring(l-2,l));
    }
}
