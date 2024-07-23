package programmers;
import java.util.*;

public class P68644 {  //두 개 뽑아서 더하기
   public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum=numbers[i]+numbers[j];
                if(!answer.contains(sum)){
                    answer.add(sum);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
  
    public static void main(String[] args) {
      int[] numbers1={2, 1, 3, 4, 1}; int[] result1={2, 3, 4, 5, 6, 7};
      int[] numbers2={5, 0, 2, 7}; int[] result2={2, 5, 7, 9, 12};
    }
}
