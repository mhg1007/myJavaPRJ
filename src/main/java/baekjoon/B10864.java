package baekjoon;

import java.util.Scanner;

public class B10864 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        int M=s.nextInt();
        for (int i = 0; i < M; i++) {
            arr[s.nextInt()-1]+=1;
            arr[s.nextInt()-1]+=1;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
