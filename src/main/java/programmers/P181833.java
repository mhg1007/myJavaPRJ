package programmers;

public class P181833 {  //특별한 이차원 배열 1
   public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            answer[i][i]=1;
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}
