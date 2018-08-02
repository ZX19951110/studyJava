import java.lang.reflect.Array;
import java.util.ArrayList;

public class bubbleSort{
    public bubbleSort (int[] sortList){
        int fin = sortList.length-1;
        while (fin > 0) {
            for (int i = 0 ; i <= fin; i++) {
                int temp;
                try {
                    if (sortList[i] < sortList[i + 1]) {
                        temp = sortList[i + 1];
                        sortList[i + 1] = sortList[i];
                        sortList[i] = temp;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
            fin--;
        }
        for (int j : sortList){
            System.out.println(j);
        }
    }
    public static void main(String args[]){
        int[] testArr = {5,25,5,8,7,6,40,8,5 , 60, 1, 2, 3};
        new bubbleSort(testArr);
    }
}
