import java.lang.reflect.Array;
import java.util.ArrayList;

public class bubbleSort{
    public bubbleSort (int[] sortList) {
        int length = sortList.length;
        while (length >= 0) {
            for (int i = 0; i + 1 < length; i++) {
                if (sortList[i + 1] <= sortList[i]) {
                    int temp = sortList[i + 1];
                    sortList[i + 1] = sortList[i];
                    sortList[i] = temp;
                }
            }
            length--;
        }
        for (int i : sortList){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        int[] testArr = {5,25,5,8,7,6,40,8,5 , 60, 1, 2, 3};
        new bubbleSort(testArr);
    }
}
