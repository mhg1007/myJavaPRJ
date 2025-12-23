package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B12813 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        String[] arr=new String[5];
        Arrays.fill(arr,"");

        for (int i = 0; i < A.length(); i++) {
            int a=Character.getNumericValue(A.charAt(i));
            int b=Character.getNumericValue(B.charAt(i));
            arr[0]+=a&b;
            arr[1]+=a|b;
            arr[2]+=a^b;
            arr[3]+=a==0?1:0;
            arr[4]+=b==0?1:0;
        }

        for(String str:arr){
            System.out.println(str);
        }
    }
}
