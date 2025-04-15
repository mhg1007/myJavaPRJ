package baekjoon;

import java.util.Scanner;

public class B1252 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        while(a.length()!=b.length()){
            if(a.length()>b.length()){
                b="0"+b;
            }
            else {
                a="0"+a;
            }
        }
        int[] arr=new int[a.length()+1];
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            if(i!=0) {
                arr[i] = arr[i]
                        +Character.getNumericValue(a.charAt(i-1))
                        +Character.getNumericValue(b.charAt(i-1));
            }
            if(arr[i]>1){
                arr[i]-=2;
                arr[i-1]+=1;
            }
            sb.append(arr[i]);
        }
        sb.reverse();
        String ans=sb.toString();
        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans=ans.replaceFirst("0","");
        }
        System.out.print(ans);
    }
}
