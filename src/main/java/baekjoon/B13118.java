package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B13118 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>(Arrays.asList(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
        int[] arr={s.nextInt(),s.nextInt(),s.nextInt()};
        System.out.print(list.contains(arr[0])?list.indexOf(arr[0])+1:0);
    }
}
