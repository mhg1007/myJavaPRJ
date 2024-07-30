package programmers;
import java.util.*;

public class P181851 {  //전국 대회 선발 고사
   public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i],i);
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        int a=map.get(list.get(0));
        int b=map.get(list.get(1));
        int c=map.get(list.get(2));
        int answer = a*10000+b*100+c;
        return answer;
    }
  
    public static void main(String[] args) {
      int[] rank={3, 7, 2, 5, 4, 6, 1};
      boolean[] attendance={false, true, true, true, true, false, false};
      int result=20403;
    }
}
