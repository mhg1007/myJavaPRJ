package baekjoon;

import java.util.Scanner;

public class B10804 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < 10; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int j,k,l;
            int seq=(b-a)%2==0? (b-a)/2 : (b-a)/2+1;
            for (j=a-1,k=b-1,l=0; l < seq ; j++,k--,l++) {
                int tmp=arr[j];
                arr[j]=arr[k];
                arr[k]=tmp;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int a:arr){
            sb.append(a).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
