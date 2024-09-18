package programmers;
public class P181835 { //조건에 맞게 수열 변환하기 3
  public int[] solution(int[] arr, int k) {
    int[] answer = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      answer[i]=k%2==0?arr[i]+k:arr[i]*k;
    }
    return answer;
  }
  public static void main(String[] args) {
    int[] arr={1, 2, 3, 100, 99, 98};
    int k=3;
    int[] result={3, 6, 9, 300, 297, 294};
  }
} 
