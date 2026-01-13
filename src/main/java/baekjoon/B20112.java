package baekjoon;

import java.util.Scanner;

public class B20112 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char[][] arr=new char[N][N];
        for (int i = 0; i < N; i++) {
            String str=s.next();
            for (int j = 0; j < N; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        int count=0;
        int count2=0;
        for (int i = N-1; i >0 ; i--) {
            count2+=i;
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i][j]==arr[j][i]){
                    count++;
                }
            }
        }
        if(count==count2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
