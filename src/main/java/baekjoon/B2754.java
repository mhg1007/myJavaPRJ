package baekjoon;
import java.util.*;
public class B2754 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] arr= {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D+","D0","D-","F"};
        double[] arr2={4.3,4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0.7,0.0};
        String str=s.next();
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(str, arr[i])){
                System.out.print(arr2[i]);
            }
        }
    }
}
