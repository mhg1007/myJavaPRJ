package baekjoon;
import java.util.Scanner;
public class B1436 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int d=0;
        for (int i = 666; i <= 2666799 ; i++) {
            String str=String.valueOf(i);
            int check=0;
            for (int j = 0; j < str.length()-2; j++) {
                if(str.charAt(j)=='6' && str.charAt(j+1)=='6' && str.charAt(j+2)=='6'){
                    check++;
                }
            }
            if(check>=1){
                d++;
            }
            if(d==N){
                System.out.print(i);
                break;
            }
        }
    }
}
