package baekjoon;
import java.util.Scanner;
public class B2675 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i=0;i<T;i++){
            int R=s.nextInt();
            String S=s.next();
            int L=S.length();
            for (int j=0;j<L;j++){
                for(int k=0; k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
