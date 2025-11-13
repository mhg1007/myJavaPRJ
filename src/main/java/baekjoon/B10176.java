package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10176 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            String str=s.next();
            char[] arr=str.replaceAll("[^A-Za-z]","").toLowerCase().toCharArray();
            Arrays.sort(arr);
            boolean chk=true;
            for (int j = 0; j < arr.length/2+1; j++) {
                if(arr[j]+arr[arr.length-1-j]!=219){
                    chk=false;
                    break;
                }
            }
            System.out.println(chk?"Yes":"No");
        }
    }
}
