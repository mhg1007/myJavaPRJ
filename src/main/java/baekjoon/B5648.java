package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B5648 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] arr=new long[n];
        for (int i = 0; i < n; i++) {
            long a=s.nextLong();
            arr[i]=rvs(a);
        }
        Arrays.sort(arr);
        for(long a:arr){
            System.out.println(a);
        }
    }
    public static long rvs(long a){
        String str=String.valueOf(a);
        String ch="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ch+=str.charAt(i);
        }
        return Long.parseLong(ch);
    }
}
