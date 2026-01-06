package baekjoon;

import java.util.Scanner;

public class B15238 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String str=s.next();
        int[] arr=new int[26];
        for (int i = 0; i < N; i++) {
            char a=str.charAt(i);
            arr[a-97]++;
        }
        int max=0;
        int mp=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                mp=i;
            }
        }
        char sb=(char)(mp+97);
        System.out.print(sb+" "+max);
    }
}
