package baekjoon;

import java.util.Scanner;

public class B11549 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ans=s.nextInt();
        int[] arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
        }
        int cnt=0;
        for(int a:arr){
            if(a==ans){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
