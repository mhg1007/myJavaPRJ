package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B14194 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            List<Integer> list = new ArrayList<>();
            int sum=0;
            for (int j = 0; j < n; j++) {
                int num = s.nextInt();
                list.add(num);
                sum+=num;
            }
            double A=(Collections.min(list)+Collections.max(list))/2.0;
            double B= (double) sum /list.size();
            System.out.println(Math.abs(A-B)<1? "Yes":"No");
        }
    }
}
