public class insertSort {
    insertSort(int[] sortList) {
        for (int i = 1; i < sortList.length; i++) {
            int position = 0;
            int temp = sortList[i];
            for (; position < i; position++) {
                if(sortList[i] < sortList[position]) break;
            }
            if(position != i){
                for (int j = i; j > position; j--){
                    sortList[j] = sortList[j-1];
                }
                sortList[position] = temp;
            }
        }
    }
    public static void main(String args[]){
        int[] sortArr = {8,4,10,9,1,3,5,9,2};
        new insertSort(sortArr);
        for(int i : sortArr){
            System.out.println(i);
        }
    }
}