package baekjoon;

import java.util.Scanner;

public class B2145 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int N=s.nextInt();
            if(N==0) break;
            while(N>9){
                N=sum(N);
            }
            System.out.println(N);
        }
    }
    public static int sum(int a){
        String str=String.valueOf(a);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum+=Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}
