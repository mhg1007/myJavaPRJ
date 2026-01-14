package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B20650 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int a=arr[0];
        int b=0,c=0;
        int abc=arr[6];
        int bc=abc-a;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if(bc-arr[i]==arr[j]){
                    b=Math.min(arr[i],arr[j]);
                    c=Math.max(arr[i],arr[j]);
                }
            }
        }
        System.out.print(a+" "+b+" "+c);
    }
}
