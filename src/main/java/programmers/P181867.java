package programmers;

public class P181867 {
  
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i]=arr[i].length();
        }
        return answer;
    }
  
    public static void main(String[] args) {
      String str1="oxooxoxxox";
      String str2="xabcxdefxghi";
      int[] ans1={1, 2, 1, 0, 1, 0};
      int[] ans2={0, 3, 3, 3};
    }
}
