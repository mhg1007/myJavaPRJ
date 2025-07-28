package baekjoon;

import java.util.Scanner;

public class B3028 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,0,0};
        String ord=s.next();
        for (int i = 0; i < ord.length(); i++) {
            int a=0;
            int b=1;
            switch (ord.charAt(i)){
                case 'A':
                    break;
                case 'B':
                    a=1;
                    b=2;
                    break;
                case 'C':
                    b=2;
                    break;
            }
            int tmp=arr[a];
            arr[a]=arr[b];
            arr[b]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                System.out.print(i+1);
                break;
            }
        }
    }
}
