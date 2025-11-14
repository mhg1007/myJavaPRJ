package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B10545 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a={21,22,23,31,32,33,41,42,43,51,52,53,61,62,63,71,72,73,74,81,82,83,91,92,93,94};
        Map<Character,int[]> map=new HashMap<>();
        char c='a';
        for (int i = 0; i < 26; i++) {
            map.put(c, new int[]{a[i] / 10, a[i] % 10});
            c+=1;
        }
        int[] arr=new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i]=s.nextInt();
        }
        String str=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cc=str.charAt(i);
            int[] ar=map.get(cc);
            int pos=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==ar[0]){
                    pos=j+1;
                    break;
                }
            }
            if(i!=0 && Character.getNumericValue(sb.charAt(sb.length()-1))==pos){
                sb.append("#");
            }
            sb.append(String.valueOf(pos).repeat(ar[1]));
        }
        System.out.print(sb);
    }
}
