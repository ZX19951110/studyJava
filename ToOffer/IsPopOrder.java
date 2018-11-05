package ToOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsPopOrder {
    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    Boolean is_order(int[] arr1,int[] arr2){
        Stack<Integer> s = new Stack<>();
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if(!s.contains(arr1[j]) && !out.contains(arr1[j])){
                    s.add(arr1[j]);
                }
                if(arr1[j] == arr2[i]) break;
            }
            int pop = s.pop();
            if(pop != arr2[i]) return false;
            out.add(pop);
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,1,2,5,3};
        System.out.println(new IsPopOrder().is_order(arr1,arr2));
    }
}
