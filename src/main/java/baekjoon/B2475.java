package baekjoon;

import java.util.Scanner;

public class B2475 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        int sum=0;
        for(int i=0; i<5; i++){
            sum+=arr[i]*arr[i];
        }
        System.out.print(sum%10);
    }
}
