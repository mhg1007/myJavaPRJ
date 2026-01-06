package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B15739 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int chk=N*(N*N+1)/2;
        int[][] arr=new int[N][N];
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j]=s.nextInt();
                set.add(arr[i][j]);
            }
        }
        boolean ms=set.size()==N*N;
        int s3=0,s4=0;
        for (int i = 0; i < N; i++) {
            int s1=0,s2=0;
            for (int j = 0; j < N; j++) {
                s1+=arr[i][j];
                s2+=arr[j][i];
            }
            if(s1!=chk||s2!=chk){
                ms=false;
            }
            s3+=arr[i][i];
            s4+=arr[i][N-1-i];
        }
        if(s3!=chk||s4!=chk){
            ms=false;
        }
        System.out.print(ms?"TRUE":"FALSE");
    }
}
