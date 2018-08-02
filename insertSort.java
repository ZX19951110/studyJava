public class insertSort {
    public insertSort(int[] sortList){
        int move = 1;
        for (; move < sortList.length;){
            if (sortList[move] < sortList[move-1]){
                int temp = sortList[move];
                for (int i = move;; i--){
                    if (i == 0) {
                        sortList[i] = temp;
                        break;
                    }
                    if (sortList[i-1] < temp){
                        sortList[i] = temp;
                        break;
                    }
                    sortList[i] = sortList[i-1];
                }

            }
            move++;


        }
        System.out.println("___________");
        for(int i : sortList){
            System.out.println(i);

        }
        System.out.println("___________");
    }
    public static void main(String args[]){
        int[] sortArr = {2,4,1,5,6,3,10,66,8,9};
        new insertSort(sortArr);
    }
}
