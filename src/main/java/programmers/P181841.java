package programmers;
public class P181841 { //꼬리 문자열
  public String solution(String[] arr, String ex) {
        String answer = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains(ex)){
                continue;
            }
            answer+=arr[i];
        }
        return answer;
    }
  public static void main(String[] args) {
  }
}
