package baekjoon;

import java.util.Scanner;

public class B17362 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n%8;
        switch (m){
            case 1:
                System.out.print(1);
                break;
            case 2: case 0:
                System.out.print(2);
                break;
            case 3: case 7:
                System.out.print(3);
                break;
            case 4: case 6:
                System.out.print(4);
                break;
            case 5:
                System.out.print(5);
                break;
        }
    }
}
