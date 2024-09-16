package programmers;
public class P181836 { //그림 확대
  public String[] solution(String[] picture, int k) {
    String[] answer = new String[picture.length*k];
    int pos=0;
    for(int i=0; i<picture.length; i++){
      StringBuilder sb=new StringBuilder();
      for(int j=0; j<picture[i].length(); j++){
        for(int l=0; l<k; l++){
          sb.append(picture[i].charAt(j));
        }
      }
      for(int j=0; j<k; j++){
        answer[pos]=sb.toString();
        pos++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
  }
}
