import java.util.ArrayList;

public class Qsort {
    public void quickSort(int[] sortList, int low, int high){
        if (low >= high){
            return ;
        }
        int i = low, j = high, k = sortList[low];
        for (; i < j;){
            for (; sortList[j] >= k && i < j;){
                j--;
            }
            if (sortList[j] < k){
                for (; sortList[i] <= k && i < j;){
                    i++;
                }
                    if (sortList[i] > k) {
                        int temp = sortList[j];
                        sortList[j] = sortList[i];
                        sortList[i] = temp;
                    }
            }
        }
        sortList[low] = sortList[j];
        sortList[j] = k;
        quickSort(sortList, low, j-1);
        quickSort(sortList, j+1, high);
        for (int item : sortList){
            System.out.println(item);
        }
        System.out.println("_________");
    }
    public static void main(String args[]){
        int[] sortList = {8,2,7,3,5,5,61,78,555,1,6,88,72,45};
        new Qsort().quickSort(sortList,0 ,13);
    }
}
