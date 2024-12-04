package baekjoon;

import java.util.Scanner;

public class B4246 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            int n=s.nextInt();
            if(n==0){
                break;
            }
            String str=s.next();
            int l=str.length();
            int seq=0;
            char[][] arr=new char[l/n][n];
            for (int i = 0; i < l/n; i++) {
                String cut=str.substring(0,n);
                if(seq==0){
                    for (int j = 0; j < n; j++) {
                        arr[i][j]=cut.charAt(j);
                    }
                    seq++;
                }
                else{
                    for (int j = 0; j < n; j++) {
                        arr[i][j]=cut.charAt(n-1-j);
                    }
                    seq--;
                }
                str=str.replaceFirst(cut,"");
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l/n; j++) {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
