package baekjoon;

import java.util.*;

public class B9417 {
    public static int ecd(int a, int b) {
        return b==0?a:ecd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < N; i++) {
            String ln=s.nextLine();
            String[] arr=ln.split(" ");
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(j!=k){
                        list.add(ecd(Integer.parseInt(arr[j]),Integer.parseInt(arr[k])));
                    }
                }
            }
            System.out.println(Collections.max(list));
        }
    }
}
