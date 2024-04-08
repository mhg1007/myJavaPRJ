package programmers;

import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] array=new String[n];

        for (int i=0; i<n; i++){
            String c=s.next();
            array[i]=c;
        }
        System.out.print(solution(array));
        }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
}
