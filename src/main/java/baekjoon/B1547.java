package baekjoon;

import java.util.Scanner;

public class B1547 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] cup={1,0,0};
        int M=s.nextInt();
        for (int i = 0; i < M; i++) {
            int x=s.nextInt()-1;
            int y=s.nextInt()-1;
            int tmp=cup[x];
            cup[x]=cup[y];
            cup[y]=tmp;
        }
        for (int i = 0; i < cup.length; i++) {
            if(cup[i]==1){
                System.out.print(i+1);
                break;
            }
        }
    }
}
