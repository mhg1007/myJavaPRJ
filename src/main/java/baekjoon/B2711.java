package baekjoon;
import java.util.Scanner;
public class B2711 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            String str=s.next();
            String chg="";
            for (int j = 0; j < str.length(); j++) {
                if(j==n-1)
                    continue;
                chg+=str.charAt(j);
            }
            System.out.println(chg);
        }
    }
}
