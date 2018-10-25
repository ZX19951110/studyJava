public class Qsort {
    private void quickSort(int[] sortList, int low, int high){
        if (low >= high){
            return ;
        }
        int i = low, j = high, k = sortList[low];
        for (; i < j;){
            for (; sortList[j] >= k && i < j;j--);
                for (; sortList[i] <= k && i < j;i++);
                        int temp = sortList[j];
                        sortList[j] = sortList[i];
                        sortList[i] = temp;
                    }
        sortList[low] = sortList[j];
        sortList[j] = k;
        quickSort(sortList, low, j-1);
        quickSort(sortList, j+1, high);
    }
    public static void main(String args[]){
        int[] sortList = {8,2,7,3,5,5,61,78,555,1,6,88,72,45};
        new Qsort().quickSort(sortList,0 ,13);
        for(int i : sortList){
            System.out.println(i);
        }
    }
}