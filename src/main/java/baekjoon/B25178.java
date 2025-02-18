package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B25178 {
    public static String drm(String org){
        return org.replaceAll("[aeiou]","");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String a=s.next();
        String b=s.next();
        String ans="NO";
        String[] arr=a.split("");
        String[] arr2=b.split("");
        Arrays.sort(arr);
        Arrays.sort(arr2);
        boolean chk=true;
        for (int i = 0; i < N; i++) {
            if (!arr[i].equals(arr2[i])) {
                chk = false;
                break;
            }
        }
        if(a.charAt(0)==b.charAt(0) &&
                a.charAt(a.length()-1)==b.charAt(b.length()-1) && chk){
            String as=a.substring(1, a.length()-1);
            String bs=b.substring(1, b.length()-1);
            if(drm(as).equals(drm(bs))){
                ans="YES";
            }
        }
        System.out.println(ans);
    }
}
