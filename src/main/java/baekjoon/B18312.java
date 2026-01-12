package baekjoon;

import java.util.Scanner;

public class B18312 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={0,0,0};
        int N=s.nextInt();
        String K=s.next();
        int cnt=0;
        while(arr[0]<N+1){
            String hh=String.format("%02d",arr[0]);
            String mm=String.format("%02d",arr[1]);
            String ss=String.format("%02d",arr[2]);
            String time=hh+mm+ss;
            if(time.contains(K)){
                cnt++;
            }
            arr[2]+=1;
            if(arr[2]==60){
                arr[2]=0;
                arr[1]+=1;
            }
            if(arr[1]==60){
                arr[1]=0;
                arr[0]+=1;
            }
        }
        System.out.print(cnt);
    }
}
