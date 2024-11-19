package baekjoon;
import java.util.Scanner;
public class B15813 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        char[] arr=new char[l];
        String str=s.next();
        for (int i = 0; i < l; i++) {
            arr[i]=str.charAt(i);
        }
        int scr=0;
        for (int i = 0; i < l; i++) {
            scr+=(int)arr[i]-64;
        }
        System.out.print(scr);
    }
}
