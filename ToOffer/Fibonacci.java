package ToOffer;

public class Fibonacci {
    int build(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return build(n-1) + build(n-2);
    }
    public static void main(String[] args){
        System.out.println(new Fibonacci().build(11));
    }
}