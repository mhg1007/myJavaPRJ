package programmers;
public class P181837 { //커피 심부름
  public int solution(String[] order) {
    int answer = 0;
    for(String a:order){
      if(a.contains("americano")||a.equals("anything")){
        answer+=4500;
      }
      else{
        answer+=5000;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    String[] order={"cafelatte", "americanoice", "hotcafelatte", "anything"};
    int result=19000;
  }
}
