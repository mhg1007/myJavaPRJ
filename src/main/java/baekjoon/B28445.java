package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B28445 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] arr=new String[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=s.next();
        }
        arr= Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr);
        for (String a : arr) {
            for (String b : arr) {
                System.out.println(a + " " + b);
            }
        }
    }
}
