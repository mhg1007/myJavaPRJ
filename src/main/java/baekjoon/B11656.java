package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11656 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        String[] arr=new String[S.length()];
        String SS="";
        for (int i = 0; i < S.length(); i++) {
            SS=S.charAt(S.length()-1-i)+SS;
            arr[i]=SS;
        }
        Arrays.sort(arr);
        for (String a : arr) {
            System.out.println(a);
        }
    }
}
