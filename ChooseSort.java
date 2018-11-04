public class ChooseSort {
     void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int index = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[index]) index = j;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {8,4,10,9,1,3,5,9,2};
        new ChooseSort().sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
