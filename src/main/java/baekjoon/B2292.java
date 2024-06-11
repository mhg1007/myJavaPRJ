package baekjoon;
import java.util.Scanner;
public class B2292 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int st=2;
        int ed=7;
        if(N>=st && N<=ed){
            System.out.print(2);
        }
        else if(N==1){
            System.out.print(1);
        }
        for (int i=1; i<Math.sqrt(N); i++){
            st=st+6*i;
            ed=ed+6*(i+1);
            if(N>=st && N<=ed){
                System.out.print((i+2));
            }
        }
    }
}
