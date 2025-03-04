package baekjoon;

import java.util.Scanner;

public class B1244 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int p=s.nextInt();
        for (int i = 0; i < p; i++) {
            int x=s.nextInt();
            int m=s.nextInt();
            if(x==1){
                for (int j = m-1; j < n; j+=m) {
                    arr[j] = arr[j]==0? 1:0;
                }
            }
            else if(x==2){
                int sp=m-1;
                int ep=m-1;
                while(true){
                    if(sp-1>=0 && ep+1<n){
                        if(arr[sp-1]==arr[ep+1]){
                            sp--;
                            ep++;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        break;
                    }
                }
                for (int j = sp; j <=ep ; j++) {
                    arr[j]= arr[j]==0? 1:0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(i==n-1 || (i+1)%20==0){
                System.out.print(arr[i]);
                if((i+1)%20==0){
                    System.out.println();
                }
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
