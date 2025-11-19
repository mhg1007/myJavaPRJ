package baekjoon;

import java.util.Scanner;

public class B10808 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[] apb={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] check=new int[26];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < apb.length; j++) {
                if(str.charAt(i)==apb[j]){
                    check[j]+=1;
                }
            }
        }
        for (int a:check){
            System.out.print(a+" ");
        }
    }
}
