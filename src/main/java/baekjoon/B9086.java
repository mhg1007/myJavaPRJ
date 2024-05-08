package baekjoon;
import java.util.Scanner;
public class B9086 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        String[][] fe= new String[T][2];
        for (int i=0;i<T;i++){
            String S=s.next();
            int l=S.length();
            fe[i][0]=S.substring(0,1);
            fe[i][1]=S.substring(l-1,l);
        }
        for (int i=0; i<T;i++){
            System.out.print(fe[i][0]);
            System.out.println(fe[i][1]);
        }
    }
}
