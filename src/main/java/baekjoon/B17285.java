package baekjoon;

import java.util.Scanner;

public class B17285 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.next();
        char[] arr=str.toCharArray();
        int key=arr[0]^'C';
        for(char c:arr){
            c=(char)(c^key);
            System.out.print(c);
        }
    }
}
