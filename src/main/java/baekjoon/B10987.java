package baekjoon;

import java.util.Scanner;

public class B10987 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        char[] arr={'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
            for (char c : arr) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
