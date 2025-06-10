package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2204 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            if(n==0) break;
            List<String> list=new ArrayList<>();
            List<String> list2=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str=s.next();
                list.add(str);
                list2.add(str.toLowerCase());
            }
            System.out.println(list.get(list2.indexOf(Collections.min(list2))));
        }
    }
}
