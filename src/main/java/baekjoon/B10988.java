package baekjoon;
import java.util.Scanner;
public class B10988 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        int len=S.length();
        int check=0;
        for (int i = 0; i < len ; i++) {
            char a=S.charAt(i);
            char b=S.charAt(len-i-1);
            if(a==b){
                check+=1;
            }
        }
        if(check>len/2){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}
