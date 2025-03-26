package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2960 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 2; i <= N ; i++) {
            list.add(i);
        }
        int cnt=1;
        int m1=2, m2=1;
        int rm=0;
        while (cnt<=K){
            rm=m1*m2;
            if(rm > list.get(list.size()-1)){
                m1=list.get(0);
                m2=1;
            }
            else if(!list.contains(rm)){
                m2++;
            }
            else{
                list.remove(Integer.valueOf(rm));
                cnt++;
                m2++;
            }
        }
        System.out.print(rm);
    }
}
