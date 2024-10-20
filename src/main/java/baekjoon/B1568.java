package baekjoon;
import java.util.Scanner;
public class B1568 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int fly=1;
        int count=0;
        while(N>0){
            if(N-fly<0){
                fly=1;
            }
            N=N-fly;
            fly++;
            count++;
        }
        System.out.print(count);
    }
}
