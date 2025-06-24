package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2526 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int P=s.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(N);
        int n=N;
        int pos=0;
        while(true){
            n=n*N%P;
            if(list.contains(n)){
                pos=list.indexOf(n);
                break;
            }
            else {
                list.add(n);
            }
        }
        System.out.print(list.size()-pos);
    }
}
