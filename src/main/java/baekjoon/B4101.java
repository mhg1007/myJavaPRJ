package baekjoon;

import java.util.Scanner;

public class B4101 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a==0&&b==0){
                break;
            }
            System.out.println(a>b?"Yes":"No");
        }
    }
}
