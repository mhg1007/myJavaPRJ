package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2331 {
    public static int darr(int n, int P){
        String str=String.valueOf(n);
        int ans=0;
        for (int i = 0; i < str.length(); i++) {
            ans+=(int)Math.pow(Character.getNumericValue(str.charAt(i)),P);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(A);
        int P=s.nextInt();
        int lst=0;
        while(true){
            int nxt=darr(list.get(list.size()-1),P);
            if(list.contains(nxt)){
                lst=list.indexOf(nxt);
                break;
            }
            else{
                list.add(nxt);
            }
        }
        System.out.print(lst);
    }
}
