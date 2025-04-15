package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B1251 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        String str=s.next();
        for (int i = 1; i < str.length()-1; i++) {

            StringBuilder sb1=new StringBuilder();
            sb1.append(str, 0, i);
            sb1.reverse();

            for (int j = i+1; j < str.length(); j++) {
                StringBuilder sb2=new StringBuilder();
                sb2.append(str,i,j);
                sb2.reverse();

                StringBuilder sb3=new StringBuilder();
                sb3.append(str,j,str.length());
                sb3.reverse();

                String chs= sb1.toString()+ sb2 + sb3;
                list.add(chs);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
