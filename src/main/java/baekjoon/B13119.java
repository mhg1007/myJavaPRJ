package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B13119 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),x=s.nextInt();
        char[][] a=new char[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(a[i],'.');
        }
        for (int i = 0; i < m; i++) {
            int h=s.nextInt();
            for (int j = n-1; j > n-1-h; j--) {
                a[j][i]='#';
            }
        }
        for (int i = 0; i < a[n-x].length; i++) {
            if(a[n-x][i]=='.'){
                a[n-x][i]='-';
            }
            else if(a[n-x][i]=='#'){
                a[n-x][i]='*';
            }
        }
        for (int i = 2; i < m; i+=3) {
            if(a[n-x][i]!='*'){
                for (int j = n-1; j > n-x; j--) {
                    if(a[j][i]=='.'){
                        a[j][i]='|';
                    }
                }
            }
        }
        for(char[] c:a){
            System.out.println(c);
        }
    }
}
