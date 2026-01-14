package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B21312 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] bvg={s.nextInt(), s.nextInt(), s.nextInt()};
        List<Integer> list=List.of(bvg[0], bvg[1], bvg[2], bvg[0]*bvg[1], bvg[0]*bvg[2], bvg[1]*bvg[2], bvg[0]*bvg[1]*bvg[2]);
        int max=0;
        for (int a : list) {
            if((max%2==0 && a%2==0)||(max%2!=0 && a%2!=0)){
                max=Math.max(max, a);
            }
            else if(max%2==0 && a%2!=0){
                max=a;
            }
        }
        System.out.print(max);
    }
}
