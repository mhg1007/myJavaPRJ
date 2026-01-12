package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B17838 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String cmd=s.next();

            char[] arr=cmd.toCharArray();
            Set<Character> set=new HashSet<>();
            Set<Character> as=new HashSet<>();
            Set<Character> bs=new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if(j==0||j==1||j==4){
                    as.add(arr[j]);
                }
                if(j==2||j==3||j==5||j==6){
                    bs.add(arr[j]);
                }
                set.add(arr[j]);
            }

            if(cmd.length()==7 && set.size()==2 &&
                    (as.size()==1&&bs.size()==1)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
