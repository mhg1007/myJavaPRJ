package programmers;

public class P120812 {  //최빈값 구하기
    public int solution(int[] array) {
        int[] count=new int[1000];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        int max=0;
        for(int j:count){
            if(j>max){
                max=j;
            }
        }
        int answer = 0;
        for(int i=0; i<1000; i++){
            if(count[i]==max){
                if(answer==0){
                    answer=i;   
                }
                else{
                    return -1;
                }
            }
        }
        return answer;
    }
  
    public static void main(String[] args) {
      int[] a1={1, 2, 3, 3, 3, 4};
      int[] a2={1, 1, 2, 2};
      int[] a3={1};
      int ans1=3;
      int ans2=-1;
      int ans3=1;
    }
}
