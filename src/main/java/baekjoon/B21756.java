package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B21756 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int N=s.nextInt();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        while(list.size()>1){
            List<Integer> chg=new ArrayList<>();
            for (int i = 0; i < list.size(); i+=2) {
                list.set(i,0);
            }
            for(int a:list){
                if(a!=0){
                    chg.add(a);
                }
            }
            list=chg;
        }
        System.out.print(list.get(0));
    }
}
