package baekjoon;
import java.util.Scanner;
public class B6359 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];   //방의 상태 배열, 잠금=1 열림=0
            for (int j = 2; j <= n; j++) {
                for (int k = 0; k < n; k++) {
                    if((k+1)%j==0){
                        if(arr[k]==1){
                            arr[k]=0;
                        }
                        else if(arr[k]==0){
                            arr[k]=1;
                        }
                    }
                }
            }
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
