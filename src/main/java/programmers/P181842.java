package programmers;
public class P181842 { //부분 문자열
  public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)){
            answer++;
        }
        return answer;
    }
  public static void main(String[] args) {
  }
}
