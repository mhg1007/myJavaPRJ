package baekjoon;
import java.util.Scanner;
public class B10995 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            if((i+1)%2!=0){
                for (int j = 0; j <N*2-1 ; j++) {
                    if(j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for (int j = 0; j <N*2 ; j++) {
                    if(j%2!=0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
