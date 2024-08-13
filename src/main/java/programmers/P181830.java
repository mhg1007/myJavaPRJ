package programmers;

public class P181851 {  //정사각형으로 만들기
   public int[][] solution(int[][] arr) {
        int len=Math.max(arr.length, arr[0].length);
        int[][] answer = new int[len][len];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i][j]=arr[i][j];
            }
        }
        return answer;
    }
  
    public static void main(String[] args) {
    }
}
