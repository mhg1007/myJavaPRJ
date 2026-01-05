package baekjoon;

import java.util.Scanner;

public class B14696 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        for (int i = 0; i < N; i++) {
            int[] arr=new int[4];
            int[] brr=new int[4];
            int an=s.nextInt();
            for (int j = 0; j < an; j++) {
                arr[s.nextInt()-1]+=1;
            }
            int bn=s.nextInt();
            for (int j = 0; j < bn; j++) {
                brr[s.nextInt()-1]+=1;
            }
            if(arr[3]!=brr[3]){
                System.out.println(arr[3]>brr[3]?"A":"B");
            }
            else if(arr[2]!=brr[2]){
                System.out.println(arr[2]>brr[2]?"A":"B");
            }
            else if(arr[1]!=brr[1]){
                System.out.println(arr[1]>brr[1]?"A":"B");
            }
            else if(arr[0]!=brr[0]){
                System.out.println(arr[0]>brr[0]?"A":"B");
            }
            else{
                System.out.println("D");
            }
        }
    }
}
