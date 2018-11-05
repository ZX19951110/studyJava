package ToOffer;

public class ReOrderArray {
    /*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
    int[] re_order(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) continue;
            int position = 0;
            int temp = arr[i];
            for(;position < i; position++){
                if (arr[position] % 2 == 0)break;
            }
            for (int j = i; j > position; j--){
                arr[j] = arr[j-1];
            }
            arr[position] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] sortArr = {1,2,3,4,5,6,7,8,9,10};
        new ReOrderArray().re_order(sortArr);
        for(int i : sortArr){
            System.out.println(i);
        }
    }
}
