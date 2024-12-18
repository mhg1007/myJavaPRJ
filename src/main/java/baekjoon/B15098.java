package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B15098 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        String[] arr=S.split(" ");
        Arrays.sort(arr);
        boolean chk=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].equals(arr[i+1])){
                chk=false;
                break;
            }
        }
        System.out.print(chk?"yes":"no");
    }
}
