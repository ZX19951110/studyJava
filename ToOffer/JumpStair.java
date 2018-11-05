package ToOffer;

public class JumpStair {
    int jump(int stair){
        if (stair == 1) return 1;
        if (stair == 2) return 2;
        return jump(stair-1) + jump(stair - 2);
    }
    public static void main(String[] args){
        System.out.println(new JumpStair().jump(10));
    }
}
