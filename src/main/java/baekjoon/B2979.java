package baekjoon;
import java.util.Scanner;
public class B2979 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        int[] arr=new int[100];
        for (int i = 0; i < 3; i++) {
            int ar=s.nextInt();
            int lv=s.nextInt();
            for (int j = ar; j <lv ; j++) {
                arr[j]++;
            }
        }
        int sum=0;
        for (int i = 0; i < 100; i++) {
            if(arr[i]==1){
                sum+=A;
            }
            else if(arr[i]==2){
                sum+=B*2;
            }
            else if(arr[i]==3){
                sum+=C*3;
            }
        }
        System.out.println(sum);
    }
}
