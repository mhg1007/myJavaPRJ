package baekjoon;

import java.util.Scanner;

public class B2386 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            String str=s.nextLine();
            if(str.equals("#")) break;
            String[] arr=str.split(" ");
            int cnt=0;
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    if(String.valueOf(arr[i].charAt(j)).toLowerCase().equals(arr[0])){
                        cnt++;
                    }
                }
            }
            System.out.println(arr[0]+" "+cnt);
        }
    }
}
