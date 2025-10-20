package baekjoon;

import java.util.Scanner;

public class B9093 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < T; i++) {
            String str=s.nextLine();
            String[] arr=str.split(" ");
            for (int j = 0; j < arr.length; j++) {
                String a=arr[j];
                StringBuilder sb=new StringBuilder();
                sb.append(a);
                sb.reverse();
                System.out.print(sb);
                if(j!= arr.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
