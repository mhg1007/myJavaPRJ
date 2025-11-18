package baekjoon;

import java.util.Scanner;

public class B10768 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int d=s.nextInt();
        if(m>2 || (m==2 && d>18)){
            System.out.print("After");
        }
        else if(m==2 && d==18){
            System.out.print("Special");
        }
        else{
            System.out.print("Before");
        }
    }
}
