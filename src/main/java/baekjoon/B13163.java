package baekjoon;

import java.util.Scanner;

public class B13163 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        for (int i = 0; i < N; i++) {
            String[] arr=s.nextLine().split(" ");
            StringBuilder sb=new StringBuilder();
            sb.append("god");
            for (int j = 1; j < arr.length; j++) {
                sb.append(arr[j]);
            }
            System.out.println(sb);
        }
    }
}
