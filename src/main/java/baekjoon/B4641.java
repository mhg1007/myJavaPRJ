package baekjoon;

import java.util.Objects;
import java.util.Scanner;

public class B4641 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str=s.nextLine();
            if(Objects.equals(str, "-1"))
                break;
            String[] arr=str.split(" ");
            int count=0;
            for (String i : arr) {
                for (String j : arr) {
                    if(Objects.equals(i, j))
                        continue;
                    if (Integer.parseInt(i) * 2 == Integer.parseInt(j))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
