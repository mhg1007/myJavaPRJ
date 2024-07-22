package programmers;

public class P120924 {  //다음에 올 숫자
   public int solution(int[] common) {
        int d1=common[1]-common[0];
        int d2=common[2]-common[1];
        return d1==d2?common[common.length-1]+d1:common[common.length-1]*(d2/d1);
    }
  
    public static void main(String[] args) {
      int[] common1={1, 2, 3, 4}; int ans1=5;
      int[] common2={2, 4, 8}; int ans2=16;
    }
}
