package baekjoon;

import java.util.Scanner;

public class B10757 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        int len=Math.max(A.length(),B.length());
        if(A.length()!=len){
            while (A.length()!=len){
                A="0"+A;
            }
        }
        else{
            while (B.length()!=len){
                B="0"+B;
            }
        }
        int[] arr=new int[len+1];
        for (int i = len-1; i >= 0 ; i--) {
            int a=Character.getNumericValue(A.charAt(i));
            int b=Character.getNumericValue(B.charAt(i));
            arr[i+1]+=a+b;
            if(arr[i+1]>9){
                arr[i+1]-=10;
                arr[i]+=1;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:arr){
            sb.append(i);
        }
        String answer=sb.toString();
        while(answer.charAt(0)=='0'){
            answer=answer.replaceFirst("0","");
        }
        System.out.print(answer);
    }
}
