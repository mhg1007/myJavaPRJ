public class FibNum {
    public static void main(String[] args) {

        int k=0;

        for(int i=1; i<100; i=i+k){ //100이하까지만 작동
            k=k+i;
            System.out.println(i);
            System.out.println(k);
        }
    }
}
