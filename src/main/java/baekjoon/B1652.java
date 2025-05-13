package baekjoon;

import java.util.Scanner;

public class B1652 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char[][] arr=new char[N][N];
        for (int i = 0; i < N; i++) {
            String str=s.next();
            arr[i]=str.toCharArray();
        }
        int cnt1=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if(arr[i][j]=='.' && arr[i][j+1]=='.'){
                    cnt1++;
                    while(j+1<N && arr[i][j+1]=='.'){
                        j++;
                    }
                }
            }
        }
        int cnt2=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if(arr[j][i]=='.' && arr[j+1][i]=='.'){
                    cnt2++;
                    while(j+1<N && arr[j+1][i]=='.'){
                        j++;
                    }
                }
            }
        }
        System.out.print(cnt1+" "+cnt2);
    }
}
