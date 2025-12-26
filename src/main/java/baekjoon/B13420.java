package baekjoon;

import java.util.Scanner;

public class B13420 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        for (int i = 0; i < T; i++) {
            String str=s.nextLine();
            String[] arr=str.split(" ");
            long a=Long.parseLong(arr[0]);
            long b=Long.parseLong(arr[2]);
            long c=Long.parseLong(arr[4]);
            long answer=0;
            switch (arr[1]){
                case "+":
                    answer=a+b;
                    break;
                case "-":
                    answer=a-b;
                    break;
                case "*":
                    answer=a*b;
                    break;
                case "/":
                    answer=a/b;
                    break;
            }
            System.out.println(c==answer?"correct":"wrong answer");
        }
    }
}
