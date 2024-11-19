package baekjoon;

public class B15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i: a){
            ans+=i;
        }
        return ans;
    }
}
