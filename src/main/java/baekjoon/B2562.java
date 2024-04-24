package baekjoon;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] A=new int[9];
        for (int i=0;i<9;i++){
            A[i]=s.nextInt();
        }
        int max=A[0];
        int maxnum=1;
        for (int i=1; i<9; i++){
            if (A[i]>max){
                max=A[i];
                maxnum=i+1;
            }
        }
        System.out.print(max+"\n"+maxnum);
        s.close();
    }
}
