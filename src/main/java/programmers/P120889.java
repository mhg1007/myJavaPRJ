package programmers;
import java.util.*;

public class P120889 {  //삼각형의 완성조건 (1)
   public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2]<(sides[0]+sides[1])?1:2;
    }
  
    public static void main(String[] args) {
      int[] sides1={1, 2, 3}; int ans1=2;
      int[] sides2={3, 6, 2}; int ans2=2;
      int[] sides3={199, 72, 222}; int ans3=1;
    }
}
