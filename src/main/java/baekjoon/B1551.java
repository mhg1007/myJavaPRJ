package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1551 {
    public static List<Integer> arb(List<Integer> list){
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            res.add(list.get(i+1)-list.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        List<Integer> list=new ArrayList<>();
        String str=s.next();
        String[] ar2=str.split(",");
        for (String a : ar2) {
            list.add(Integer.parseInt(a));
        }
        for (int i = 0; i < K; i++) {
            list=arb(list);
        }
        StringBuilder sb=new StringBuilder();
        for(int a:list){
            sb.append(a).append(",");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
