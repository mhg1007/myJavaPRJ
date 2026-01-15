package baekjoon;

import java.util.Scanner;

public class B21965 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] A=new int[N];
        for (int i = 0; i < N; i++) {
            A[i]=s.nextInt();
        }
        int[] sub=new int[N-1];
        boolean chk=true;
        for (int i = 0; i < N-1; i++) {
            sub[i]=A[i+1]-A[i];
            if(sub[i]==0){
                chk=false;
                break;
            }
            else if (i>=1 && sub[i-1]<0) {
                if(sub[i]>0){
                    chk=false;
                    break;
                }
            }
        }
        if(chk){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
