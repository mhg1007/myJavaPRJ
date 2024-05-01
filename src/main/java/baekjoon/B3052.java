package baekjoon;
import java.util.*;
public class B3052 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numList=new int[10];
        for(int i=0; i<10; i++){
            int num=s.nextInt();
            numList[i]=num%42;
        }
        int[] newList= Arrays.stream(numList).distinct().toArray();
        int length=newList.length;
        System.out.print(length);
        s.close();
    }
}
