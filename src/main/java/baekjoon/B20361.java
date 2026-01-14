package baekjoon;

import java.util.Scanner;

public class B20361 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),x=s.nextInt(),k=s.nextInt();
        int[] c=new int[n];
        c[x-1]=1;
        for (int i = 0; i < k; i++) {
            int a=s.nextInt(),b=s.nextInt();
            int tmp=c[a-1];
            c[a-1]=c[b-1];
            c[b-1]=tmp;
        }
        for (int i = 0; i < n; i++) {
            if(c[i]==1){
                System.out.print(i+1);
                break;
            }
        }
    }
}
