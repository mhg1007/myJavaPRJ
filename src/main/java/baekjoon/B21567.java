package baekjoon;

import java.util.Scanner;

public class B21567 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        String d=String.valueOf((long)a*b*c);
        int[] ar=new int[10];
        for (int i = 0; i < d.length(); i++) {
            ar[Character.getNumericValue(d.charAt(i))]++;
        }
        for(int e:ar){
            System.out.println(e);
        }
    }
}
