package baekjoon;
import java.util.*;
public class B1181 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] word=new String[N];
        for (int i = 0; i < N; i++) {
            word[i]=s.next();
        }
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }
            }
        });
        for(int i=0; i< word.length; i++){
            if(i>=1 && word[i].equals(word[i-1])){
                continue;
            }
            System.out.println(word[i]);
        }
    }
}
