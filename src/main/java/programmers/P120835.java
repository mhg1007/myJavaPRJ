package programmers;
import java.util.*;

public class P120835 {  //진료순서 정하기
   public int[] solution(int[] emergency) {
        int[] emg=Arrays.copyOf(emergency,emergency.length);
        int[] answer = new int[emg.length];
        Arrays.sort(emg);
        for(int i=0; i<emg.length; i++){
            for(int j=0; j<emg.length; j++){
                if(emg[i]==emergency[j]){
                    answer[j]=emg.length-i;
                }
            }
        }
        return answer;
    }
  
    public static void main(String[] args) {
      int[] arr1={3, 76, 24};
      int[] ans1={3, 1, 2};
      
      int[] arr2={1, 2, 3, 4, 5, 6, 7};
      int[] ans2={7, 6, 5, 4, 3, 2, 1};

      int[] arr3={30, 10, 23, 6, 100};
      int[] ans3={2, 4, 3, 5, 1};
    }
}
