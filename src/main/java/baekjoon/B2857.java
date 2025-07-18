package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2857 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if(s.next().contains("FBI")){
                list.add(i+1);
            }
        }
        if(list.isEmpty()){
            System.out.print("HE GOT AWAY!");
        }
        else{
            StringBuilder sb=new StringBuilder();
            for(int a: list){
                sb.append(a).append(" ");
            }
            sb.setLength(sb.length()-1);
            System.out.print(sb);
        }
    }
}
