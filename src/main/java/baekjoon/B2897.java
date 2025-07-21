package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2897 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int R=s.nextInt();
        int C=s.nextInt();
        char[][] arr=new char[R][C];
        for (int i = 0; i < R; i++) {
            arr[i]=s.next().toCharArray();
        }
        List<String> list=new ArrayList<>();
        for (int i = 0; i < R-1; i++) {
            for (int j = 0; j < C-1; j++) {
                StringBuilder sb=new StringBuilder();
                sb.append(arr[i][j]).append(arr[i][j+1]).append(arr[i+1][j]).append(arr[i+1][j+1]);
                list.add(sb.toString());
            }
        }
        int[] spc=new int[5];
        for(String a:list){
            if(!a.contains("#")) {
                int cnt=0;
                for (int i = 0; i < a.length(); i++) {
                    if(a.charAt(i)=='X'){
                        cnt++;
                    }
                }
                spc[cnt]+=1;
            }
        }
        for(int b:spc){
            System.out.println(b);
        }
    }
}
