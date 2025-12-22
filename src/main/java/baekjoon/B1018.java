package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B1018 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        char[][] ar1=new char[8][8];
        char[][] ar2=new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==0){
                    ar1[i][j]='W';
                    ar2[i][j]='B';
                }
                else {
                    ar1[i][j]='B';
                    ar2[i][j]='W';
                }
            }
        }
        char[][] arr=new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i]=s.next().toCharArray();
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                int c1=0,c2=0;
                for (int k = i,m=0; k < i+8; k++,m++) {
                    for (int l = j, n=0; l < j+8; l++,n++) {
                        if(arr[k][l]!=ar1[m][n]){
                            c1++;
                        }
                        if(arr[k][l]!=ar2[m][n]){
                            c2++;
                        }
                    }
                }
                list.add(c1);
                list.add(c2);
            }
        }
        System.out.print(Collections.min(list));
    }
}
