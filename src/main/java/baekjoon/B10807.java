package baekjoon;

import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int N=s.nextInt();
        int[] arr=new int[N];
        int cont=0;

        for (int i=0; i<N; i++){
            int M=s.nextInt();
            arr[i]=M;
        }
        int contNum=s.nextInt();
        for (int i=0; i<N; i++){
            if (arr[i]==contNum){
                cont+=1;
            }
        }
        System.out.print(cont);
    }
}
