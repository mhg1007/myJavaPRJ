package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B10814 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            int a=s.nextInt();
            String n=s.next();
            String f=a+" "+n+" "+i;
            list.add(f);
        }
        list.sort((o1, o2) -> {
            int a1=Integer.parseInt(o1.substring(0,o1.indexOf(" ")));
            int a2=Integer.parseInt(o2.substring(0,o2.indexOf(" ")));
            if(a1==a2){
                int i1=Integer.parseInt(o1.substring(o1.lastIndexOf(" ")+1));
                int i2=Integer.parseInt(o2.substring(o2.lastIndexOf(" ")+1));
                return i1-i2;
            }
            return a1-a2;
        });
        StringBuilder sb = new StringBuilder();
        for(String a:list){
            String f=a.substring(0,a.lastIndexOf(" "));
            sb.append(f).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
