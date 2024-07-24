package baekjoon;
import java.util.Scanner;
public class B2231 {
    public static int bh(int a){
        String str=String.valueOf(a);
        int sum=a;
        for (int i = 0; i < str.length(); i++) {
            sum+=Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sj=0;
        for (int i = N; i >=0 ; i--) {
            if(bh(i)==N){
                sj=i;
            }
        }
        System.out.print(sj);
    }
}
