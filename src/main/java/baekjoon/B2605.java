package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int bf=s.nextInt();
            list.add(list.size()-bf,i+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
