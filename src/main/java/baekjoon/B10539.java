package baekjoon;
import java.util.Scanner;
public class B10539 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] af=new int[N];
        int[] bf=new int[N];
        for (int i = 0; i < N; i++) {
            af[i]=s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int bfi1=0;
            for (int j = 0; j < i ; j++) {
                bfi1+=bf[j];
            }
            bf[i]=af[i]*(i+1)-bfi1;
        }
        for(int a: bf){
            System.out.print(a+" ");
        }
    }
}
