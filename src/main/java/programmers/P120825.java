package programmers;

public class P120825 {  //문자 반복 출력하기
   public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
//            answer+=String.valueOf(my_string.charAt(i)).repeat(n);    String.repeat메서드-java11이상지원
        }
        return answer;
    }
  
    public static void main(String[] args) {
      String my_string="hello";
      int n=3;
      String result="hhheeellllllooo";
    }
}
