package programmers;
public class P181840 { //정수 찾기
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int a : num_list) {
            if (a == n) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}
