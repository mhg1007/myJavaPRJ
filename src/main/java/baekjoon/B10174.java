package baekjoon;

import java.util.Scanner;

public class B10174 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < n; i++) {
            String str=s.nextLine().toLowerCase();
            StringBuilder sb=new StringBuilder();
            sb.append(str).reverse();
            System.out.println(str.contentEquals(sb)?"Yes":"No");
        }
    }
}
