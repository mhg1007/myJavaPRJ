package baekjoon;

import java.util.Scanner;

public class B8595 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        str=str.replaceAll("[^0-9]"," ").trim();
        while(str.contains("  ")){
            str=str.replace("  "," ");
        }
        long sum=0L;
        if(!str.isEmpty()) {
            String[] arr = str.split(" ");
            for (String a : arr) {
                sum += Long.parseLong(a);
            }
        }
        System.out.print(sum);
    }
}
