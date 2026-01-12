package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            int a=Integer.parseInt(br.readLine());
            list.add(a);
            sum+=a;
        }
        int r =(n*15+50)/100;
        Collections.sort(list);
        for (int i = 0; i < r; i++) {
            sum-=list.get(i);
        }
        for (int i = n- r; i < n; i++) {
            sum-=list.get(i);
        }
        System.out.print((int)Math.round(sum/(double)(n-r*2)));
    }
}
