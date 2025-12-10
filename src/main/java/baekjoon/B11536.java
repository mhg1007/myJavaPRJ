package baekjoon;

import java.util.Scanner;

public class B11536 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] arr=new String[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.next();
        }
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < arr.length-1; i++) {
            int pos=0;
            while((pos<arr[i].length()&&pos<arr[i+1].length())
                    && arr[i].charAt(pos)==arr[i+1].charAt(pos)){
                pos++;
            }
            if(arr[i].charAt(pos)>arr[i+1].charAt(pos)){
                inc=false;
            }
            else{
                dec=false;
            }
            if(!inc&&!dec) break;
        }
        System.out.print(inc||dec? (inc? "INCREASING" : "DECREASING") : "NEITHER");
    }
}
