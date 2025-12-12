package baekjoon;

import java.util.Scanner;

public class B11586 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char[][] arr=new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.next().toCharArray();
        }
        int K=s.nextInt();
        StringBuilder sb=new StringBuilder();
        switch (K){
            case 1:
                for(char[] a:arr){
                    for(char b:a){
                        sb.append(b);
                    }
                    sb.append("\n");
                }
                break;
            case 2:
                for(char[] a:arr){
                    StringBuilder sb2=new StringBuilder();
                    for(char b:a){
                        sb2.append(b);
                    }
                    sb2.reverse();
                    sb.append(sb2);
                    sb.append("\n");
                }
                break;
            case 3:
                for (int i = N-1; i >= 0; i--) {
                    for(char c:arr[i]){
                        sb.append(c);
                    }
                    sb.append("\n");
                }
                break;
        }
        System.out.print(sb);
    }
}
