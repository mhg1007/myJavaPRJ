package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B19844 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> l1=List.of("c","j","n","m","t","s","l","d","qu");
        List<String> l2=List.of("a","e","i","o","u","h");
        String[] a=s.nextLine().split("[- ]");
        int c=0;
        for(String b:a){
            if(b.contains("'")){
                int idx=b.indexOf("'");
                if(l1.contains(b.substring(0,idx))&&l2.contains(b.substring(idx+1,idx+2))){
                    c++;
                }
            }
        }
        System.out.print(c+a.length);
    }
}
