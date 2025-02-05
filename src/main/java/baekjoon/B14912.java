package baekjoon;

import java.util.Scanner;

public class B14912 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            String str=String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if(Character.getNumericValue(str.charAt(j))==d){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
