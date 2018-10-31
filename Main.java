import java.util.*;
import java.util.List;
import java.util.ArrayList;//sorry I forgot
public class Main {
    private int test(int n){
        if(n == 1) return 1;
        else {
            return n+test(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(new Main().test(10));
    }
}