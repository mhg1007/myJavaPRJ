package programmers;

public class P181831 {  //특별한 이차원 배열 2
   public int solution(int[][] arr) {
        int answer = 0;
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==arr[j][i]){
                    count++;
                }
            }
        }
        return count==n*n?1:0;
    }
  
    public static void main(String[] args) {
    }
}
