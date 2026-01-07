package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B15975 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<Integer>[] a=new ArrayList[N];
        for (int i = 0; i < N; i++) {
            a[i]=new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            int x=s.nextInt(),y=s.nextInt();
            a[y-1].add(x);
        }
        long c=0;
        for (int i = 0; i < N; i++) {
            if(a[i].size()>1) {
                Collections.sort(a[i]);
                int z=a[i].size()-1;
                c+=a[i].get(1)-a[i].get(0)+a[i].get(z)-a[i].get(z-1);
                for (int j = 1; j < z; j++) {
                    c+=Math.min(a[i].get(j)-a[i].get(j-1),a[i].get(j+1)-a[i].get(j));
                }
            }
        }
        System.out.print(c);
    }
}
