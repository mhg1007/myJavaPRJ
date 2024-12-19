package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B15819 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int I=s.nextInt();
        String[] arr=new String[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.next();
        }
        Arrays.sort(arr);
        System.out.print(arr[I-1]);
    }
}
