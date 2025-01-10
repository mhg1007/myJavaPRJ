package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2822 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[8];
        int[] arr2=new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i]=s.nextInt();
            arr2[i]=arr[i];
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i = 3; i <8 ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        int[] pnt=new int[5];
        int pn=0;
        for (int i = 3; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(arr[i]==arr2[j]){
                    pnt[pn]=j+1;
                    pn++;
                }
            }
        }
        Arrays.sort(pnt);
        for(int a:pnt){
            System.out.print(a+" ");
        }
    }
}
