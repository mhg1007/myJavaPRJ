package baekjoon;

import java.util.Scanner;

public class B5671 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (s.hasNextInt()) {
            int N = s.nextInt();
            int M = s.nextInt();
            int count = 0;
            for (int i = N; i <= M; i++) {
                String nts = String.valueOf(i);
                if (ind(nts)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean ind(String a){
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j < a.length(); j++) {
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
        }
        return count <= 0;
    }
}
