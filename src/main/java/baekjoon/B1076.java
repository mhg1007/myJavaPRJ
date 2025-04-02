package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B1076 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr={"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        List<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.print(((list.indexOf(s.next())*10L+list.indexOf(s.next()))*(long)Math.pow(10,list.indexOf(s.next()))));
    }
}
