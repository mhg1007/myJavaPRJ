package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B11383 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        List<String> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String dd=s.next();
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < dd.length(); j++) {
                sb.append(dd.charAt(j)).append(dd.charAt(j));
            }
            list.add(sb.toString());
        }
        boolean chk=true;
        for (int i = 0; i < N; i++) {
            String dldm=s.next();
            if(!list.get(i).equals(dldm)){
                chk=false;
            }
        }
        System.out.print(chk?"Eyfa":"Not Eyfa");
    }
}
