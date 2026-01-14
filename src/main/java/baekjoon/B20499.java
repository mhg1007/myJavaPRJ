package baekjoon;

import java.util.Scanner;

public class B20499 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String kda=s.next();
        String[] arr=kda.split("/");
        int k=Integer.parseInt(arr[0]);
        int d=Integer.parseInt(arr[1]);
        int a=Integer.parseInt(arr[2]);
        System.out.print((k+a<d)||d==0?"hasu":"gosu");
    }
}
