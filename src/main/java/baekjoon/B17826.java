package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B17826 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(s.nextInt());
        }
        int rk=list.indexOf(s.nextInt());
        if(rk<5){
            System.out.print("A+");
        }
        else if(rk<15){
            System.out.print("A0");
        }
        else if(rk<30){
            System.out.print("B+");
        }
        else if(rk<35){
            System.out.print("B0");
        }
        else if(rk<45){
            System.out.print("C+");
        }
        else if(rk<48){
            System.out.print("C0");
        }
        else{
            System.out.print("F");
        }
    }
}
