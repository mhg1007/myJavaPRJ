package baekjoon;
import java.util.Scanner;
public class B10991 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N+i; j++) {
                if(N%2==0){
                    if(j>=N-i-1 && (j-i)%2!=0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j>=N-i-1 && (j-i)%2==0){
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
