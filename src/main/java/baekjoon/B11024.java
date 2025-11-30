package baekjoon;

import java.util.Scanner;

public class B11024 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < T; i++) {
            String[] arr=s.nextLine().split(" ");
            int c=0;
            for(String a:arr){
                c+=Integer.parseInt(a);
            }
            System.out.println(c);
        }
    }
}
