package programmers;

public class P120907 {  //OX퀴즈
   public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] qz=quiz[i].split(" ");
            int a=Integer.parseInt(qz[0]);
            int b=Integer.parseInt(qz[2]);
            int ans=Integer.parseInt(qz[4]);
            int res=qz[1].equals("+")?a+b:a-b;
            answer[i]=ans==res?"O":"X";
        }
        return answer;
    }
  
    public static void main(String[] args) {
      String[] quiz1={"3 - 4 = -3", "5 + 6 = 11"};
      String[] result1={"X", "O"};

      String[] quiz2={"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
      String[] result2={"O", "O", "X", "O"};
    }
}
