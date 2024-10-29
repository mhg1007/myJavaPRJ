package baekjoon;
import java.util.Scanner;
public class B3040 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr=new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        int j,k;
        int jj=0,kk=0;
        for (j = 0; j < 9; j++) {
            for (k = j+1; k < 9; k++) {
                if(sum-arr[j]-arr[k]==100){
                    jj=j;
                    kk=k;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i==jj||i==kk){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
