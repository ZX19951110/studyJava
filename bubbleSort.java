import java.lang.reflect.Array;
import java.util.ArrayList;
public class bubbleSort{
    static void bubbleSort1 (int[] sortList) {
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
    }
    static void bubbleSort2(int[] sortList){
        for(int i = 0; i < sortList.length; i++){
            for(int j = 0; j + 1 < sortList.length; j++){
                if(sortList[j + 1] <= sortList[j]) {
                    int temp = sortList[j + 1];
                    sortList[j + 1] = sortList[j];
                    sortList[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] testArr = {5,25,5,8,7,6,40,8,5 , 60, 1, 2, 3};
        //bubbleSort1(testArr);
        bubbleSort2(testArr);
        for(int i : testArr){
            System.out.println(i);
        }
    }
}
