package baekjoon;

import java.util.Scanner;

public class B5363 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < N; i++) {
            String str=s.nextLine();
            String[] arr=str.split(" ");
            StringBuilder sb=new StringBuilder();
            for (int j = 2; j < arr.length; j++) {
                sb.append(arr[j]).append(" ");
            }
            sb.append(arr[0]).append(" ").append(arr[1]);
            System.out.println(sb);
        }
    }
}
