package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2752 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        arr[0]=s.nextInt();
        arr[1]=s.nextInt();
        arr[2]=s.nextInt();
        Arrays.sort(arr);
        for(int i:arr){
            if(i!=3) {
                System.out.print(i + " ");
            }
            else{
                System.out.print(i);
            }
        }
    }
}
