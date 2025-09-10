package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B5568 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        Set<Integer> set=new HashSet<>();
        switch (k){
            case 2:
                for (int i = 0; i < n; i++) {
                    String a=String.valueOf(arr[i]);
                    for (int j = 0; j < n; j++) {
                        if(i==j) continue;
                        String b=String.valueOf(arr[j]);
                        set.add(Integer.parseInt(a+b));
                    }
                }
                break;
            case 3:
                for (int i = 0; i < n; i++) {
                    String a=String.valueOf(arr[i]);
                    for (int j = 0; j < n; j++) {
                        if(i==j) continue;
                        String b=String.valueOf(arr[j]);
                        for (int l = 0; l < n; l++) {
                            String c=String.valueOf(arr[l]);
                            if(i==l || j==l) continue;
                            set.add(Integer.parseInt(a+b+c));
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < n; i++) {
                    String a=String.valueOf(arr[i]);
                    for (int j = 0; j < n; j++) {
                        if(i==j) continue;
                        String b=String.valueOf(arr[j]);
                        for (int l = 0; l < n; l++) {
                            String c=String.valueOf(arr[l]);
                            if(l==i || l==j) continue;
                            for (int m = 0; m < n; m++) {
                                if(m==i || m==j || m==l) continue;
                                String d=String.valueOf(arr[m]);
                                set.add(Integer.parseInt(a+b+c+d));
                            }
                        }
                    }
                }
                break;
        }
        System.out.print(set.size());
    }
}
