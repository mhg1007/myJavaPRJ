package baekjoon;

import java.util.*;

public class B1302 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<String> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            if(list.contains(str)){
                list2.set(list.indexOf(str),list2.get(list.indexOf(str))+1);
            }
            else{
                list.add(str);
                list2.add(1);
            }
        }
        List<String> maxlist=new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if(Objects.equals(list2.get(i), Collections.max(list2))){
                maxlist.add(list.get(i));
            }
        }
        Collections.sort(maxlist);
        System.out.print(maxlist.get(0));
    }
}
