package ToOffer;

public class DoublePower {
    /*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。*/
    static double power(double base, int exponent){
        double res = base;
        for(int i = 1; i < exponent; i++){
            res *= base;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(power(1.5, 2));
    }
}
