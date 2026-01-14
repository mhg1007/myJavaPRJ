package baekjoon;

import java.util.Scanner;

public class B20673 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int q=s.nextInt();
        if(p<=50 && q<=10){
            System.out.println("White");
        }
        else if(q>30){
            System.out.println("Red");
        }
        else{
            System.out.println("Yellow");
        }
    }
}
