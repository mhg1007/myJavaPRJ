package baekjoon;
import java.util.Scanner;
public class B2577 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        String ABC=String.valueOf(A*B*C);
        for (int i = 0; i <10 ; i++) {
            System.out.println(count(ABC,i));
        }
    }
    public static int count(String a, int b){
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if(Integer.parseInt(String.valueOf(a.charAt(i)))==b){
                count++;
            }
        }
        return count;
    }
}
