package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B15953 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] ar1={500,300,200,50,30,10};
        List<Integer> l1=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i+1; j++) {
                l1.add(ar1[i]);
            }
        }
        int[] ar2={512,256,128,64,32};
        List<Integer> l2=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < Math.pow(2,i); j++) {
                l2.add(ar2[i]);
            }
        }

        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int sum=0;
            sum+=a>0 && a-1<l1.size()? l1.get(a-1) : 0;
            sum+=b>0 && b-1<l2.size()? l2.get(b-1) : 0;
            System.out.println(sum*10000);
        }
    }
}
