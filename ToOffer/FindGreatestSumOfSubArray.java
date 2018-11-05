package ToOffer;

public class FindGreatestSumOfSubArray {
    //连续子数组的最大和
    static int[] arr = { 1, -5, 4, 6, -3, 9 };
    static int find(int n){ //以第n个元素结尾的连续子数组最大和
        if (n == 0) return arr[0];
        if(find(n-1) < 0) return arr[n];
        else return find(n-1) + arr[n];
    }
    public static void main(String[] args){
        int res = find(0);
        for(int i = 1; i < arr.length; i++){
            if(find(i) > res) res = find(i);
        }
        System.out.println(res);
    }
}
