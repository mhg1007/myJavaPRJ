package baekjoon;

import java.util.Scanner;

public class B10823 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while(s.hasNext()){
            sb.append(s.next());
        }
        String[] arr=sb.toString().split(",");
        long sum=0;
        for(String a:arr){
            sum+=Long.parseLong(a);
        }
        System.out.print(sum);
    }
}
