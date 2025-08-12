package baekjoon;

import java.util.Scanner;

public class B4388 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a==0 && b==0) break;
            int cnt=0;
            int[] arr=new int[Math.max(String.valueOf(a).length(),String.valueOf(b).length())+1];
            int pos=arr.length-1;
            while(pos>=0){
                int ax=a%10;
                int bx=b%10;
                a/=10;
                b/=10;
                arr[pos]=ax+bx;
                pos--;
            }
            for (int i = arr.length-1; i >=0 ; i--) {
                if(arr[i]>9){
                    cnt++;
                    arr[i]-=10;
                    if(i-1>=0){
                        arr[i-1]+=1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
