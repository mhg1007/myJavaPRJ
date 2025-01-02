package programmers;
public class P181839 { //주사위 게임 1
 public int solution(int a, int b) {
  int answer = 0;
  boolean ax = a % 2 != 0;
  boolean bx = b % 2 != 0;
  if (ax && bx) {
   answer = a * a + b * b;
  } else if (!ax && !bx) {
   answer = Math.abs(a - b);
  } else {
   answer = (a + b) * 2;
  }
  return answer;
 }

 public static void main(String[] args) {
 }
}
