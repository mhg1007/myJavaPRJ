package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2755 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<String,Double> map=new HashMap<>();
        char cp='A';
        char[] cs={'+','0','-'};
        int pt=43;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                String g= String.valueOf(cp)+(cs[j]);
                map.put(g,(double)pt/10);
                pt-=3;
            }
            cp+=1;
            pt-=1;
        }
        map.put("F",0.0);
        int N=s.nextInt();
        double sum=0.0;
        int psm=0;
        for (int i = 0; i < N; i++) {
            String cls=s.next();
            int pnt=s.nextInt();
            String grd=s.next();
            psm+=pnt;
            sum+=pnt*map.get(grd);
        }
        System.out.printf("%.2f",sum/psm);
    }
}
