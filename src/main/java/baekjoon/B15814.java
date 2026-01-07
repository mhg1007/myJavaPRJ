package baekjoon;

import java.util.Scanner;

public class B15814 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String org=s.next();
        char[] arr=org.toCharArray();
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            char tmp=arr[a];
            arr[a]=arr[b];
            arr[b]=tmp;
        }
        System.out.print(String.valueOf(arr));
    }
}
