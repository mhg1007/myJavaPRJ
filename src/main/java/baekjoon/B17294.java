package baekjoon;

import java.util.Scanner;

public class B17294 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] arr=s.next().split("");
        boolean chk=true;
        if(arr.length>2) {
            int d=Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
            for (int i = 2; i < arr.length; i++) {
                int dd = Integer.parseInt(arr[i]) - Integer.parseInt(arr[i - 1]);
                if (d != dd) {
                    chk = false;
                    break;
                }
            }
        }
        System.out.print(chk?"◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!":"흥칫뿡!! <(￣ ﹌ ￣)>");
    }
}
