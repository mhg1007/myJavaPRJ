package baekjoon;

import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int c=0;
        for (int i = 1; i <=N ; i++) {
            if(hs(i)){
                c++;
            }
        }
        System.out.print(c);
    }
    public static boolean hs(int a){
        if(a<10){
            return true;
        }
        else {
            String str = String.valueOf(a);
            int count = 0;
            int[] arr = new int[str.length() - 1];
            for (int i = 0; i < str.length() - 1; i++) {
                int m = Character.getNumericValue(str.charAt(i));
                int n = Character.getNumericValue(str.charAt(i + 1));
                arr[i] = n - m;
            }
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            }
            return count == str.length() - 2;
        }
    }
}
