package baekjoon;

import java.util.Scanner;

public class B2851 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=s.nextInt();
        }
        int sum1=0, sum2=0;
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i];
            if(sum1>=100){
                sum2=sum1-arr[i];
                break;
            }
        }
        int a= Math.abs(sum1-100)>Math.abs(sum2-100)?sum2:sum1;
        System.out.print(a);
    }
}
