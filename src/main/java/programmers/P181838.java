package programmers;
public class P181838 { //날짜 비교하기
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0]<date2[0]){
            answer++;
        }
        else if(date1[0]==date2[0]){
            if(date1[1]<date2[1]){
                answer++;
            }
            else if(date1[1]==date2[1]){
                if(date1[2]<date2[2]){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
    }
}
