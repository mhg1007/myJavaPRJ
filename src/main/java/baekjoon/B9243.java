package baekjoon;
import java.util.Scanner;
public class B9243 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String a=s.next();
        String b=s.next();
        int fail=0;
        for (int i = 0; i < a.length(); i++) {
            fail+= N%2==0? (a.charAt(i)!=b.charAt(i)?1:0)
                    :(a.charAt(i)==b.charAt(i)?1:0);
        }
        System.out.print(fail==0?"Deletion succeeded":"Deletion failed");
    }
}
