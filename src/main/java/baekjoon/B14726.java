package baekjoon;

import java.util.Scanner;

public class B14726 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String[] arr=new StringBuilder(s.next()).reverse().toString().split("");
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                if(j%2!=0){
                    int tmp=Integer.parseInt(arr[j])*2;
                    if(tmp>9){
                        tmp=tmp/10+tmp%10;
                    }
                    arr[j]=String.valueOf(tmp);
                }
                sum+=Integer.parseInt(arr[j]);
            }
            System.out.println(sum%10==0?"T":"F");
        }
    }
}
