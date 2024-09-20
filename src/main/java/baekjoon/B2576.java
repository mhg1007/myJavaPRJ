package baekjoon;
import java.util.Scanner;
public class B2576 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[7];
        int sum=0;
        int count=0;
        for (int i = 0; i < 7; i++) {
            int a=s.nextInt();
            if(a%2!=0){
                arr[i]=a;
                sum+=a;
                count++;
            }
            else{
                arr[i]=-1;
            }
        }
        if(count==0){
            System.out.print(-1);
        }
        else {
            int min=101;
            for (int i = 0; i < 7; i++) {
                if(arr[i]>0 && arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.print(sum + "\n" + min);
        }
    }
}
