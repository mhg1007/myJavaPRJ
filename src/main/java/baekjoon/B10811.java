package baekjoon;
import java.util.Scanner;
public class B10811 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] basket=new int[N];
        for (int I=0;I<N; I++){
            basket[I]=I+1;
        }
        int temp;
        for (int I=0;I<M;I++){
            int i=s.nextInt();
            int j=s.nextInt();
            if((j-i)%2==0) {
                for (int J=i,K=j; J<(i+j)/2 && K>(i+j)/2; J++,K--) {
                    temp=basket[J-1];
                    basket[J-1]=basket[K-1];
                    basket[K-1]=temp;
                }
            }
            else{
                for (int J=i,K=j; J<((i+j)/2)+1 && K>(i+j)/2; J++,K--){
                    temp=basket[J-1];
                    basket[J-1]=basket[K-1];
                    basket[K-1]=temp;
                }
            }
        }
        for (int I=0;I<N;I++) {
            System.out.print(basket[I]+" ");
        }
    }
}
