package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B6996 {
    private static boolean solveAnagrams(String first, String second ) {
        if(first.length()!=second.length()){
            return false;
        }
        else{
            char[] aarr=new char[first.length()];
            char[] barr=new char[first.length()];
            for (int j = 0; j < first.length(); j++) {
                aarr[j]=first.charAt(j);
                barr[j]=second.charAt(j);
            }
            Arrays.sort(aarr);
            Arrays.sort(barr);
            int count=0;
            for (int j = 0; j < first.length(); j++) {
                if(aarr[j]==barr[j]){
                    count++;
                }
            }
            return count == first.length();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
