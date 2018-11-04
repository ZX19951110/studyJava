public class insertSort {
    insertSort(int[] sortList){
       for(int i = 1; i < sortList.length; i++){
           for (int j = i; j > 0; j--){
               if (sortList[j] < sortList[j-1]){
                   int temp = sortList[j];
                   sortList[j] = sortList[j-1];
                   sortList[j-1] = temp;
               }
           }
       }
    }
    public static void main(String args[]){
        int[] sortArr = {4,2,4,0,1,5,6,3};
        new insertSort(sortArr);
        for(int i : sortArr){
            System.out.println(i);
        }
    }
}
