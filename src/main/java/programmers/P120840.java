package programmers;

public class P120840 {  //구슬을 나누는 경우의 수
   public long solution(int balls, int share) {
        long answer = 1;
        int cnt=1;
        while(cnt<=share){
            answer*=balls--;
            answer/=cnt++;
        }
        return answer;
    }
  
    public static void main(String[] args) {
      int b1=3, s1=2, r1=3;
      int b2=5, s2=3, r2=10;
    }
}
