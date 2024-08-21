package baekjoon;
import java.util.Scanner;
public class B10773 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        int[] arr=new int[K];
        for (int i = 0,j=0; i < K; i++) {
            int n=s.nextInt();
            if(n==0){
                arr[j-1]=0;
                j--;
            }
            else{
                arr[j]=n;
                j++;
            }
        }
        int count=0;
        for(int a:arr){
            count+=a;
        }
        System.out.print(count);
    }
}
