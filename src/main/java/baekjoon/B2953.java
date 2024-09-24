package baekjoon;
import java.util.Scanner;
public class B2953 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];

        for (int i = 0; i < 5; i++) {
            arr1[i]=i+1;
            for (int j = 0; j < 4; j++) {
                arr2[i]+=s.nextInt();
            }
        }

        int max=arr2[0];
        for (int i = 1; i < 5; i++) {
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if(arr2[i]==max){
                System.out.print(arr1[i]+" "+max);
            }
        }
    }
}
