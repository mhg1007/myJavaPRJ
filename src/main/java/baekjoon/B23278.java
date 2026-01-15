package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B23278 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(),L=s.nextInt(),H=s.nextInt();
        int[] a=new int[N];
        for (int i = 0; i < N; i++) {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        for (int i = L; i < N-H; i++) {
            sum+=a[i];
        }
        System.out.print((double)sum/(N-L-H));
    }
}
