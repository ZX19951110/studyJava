public class BinarySearch {
    void search(int[] arr,int target , int start, int end){
        int search_index = (start+end)/2;
        System.out.println(":"+arr[search_index]);
        if(arr[search_index] == target) System.out.println(search_index);
        if(arr[search_index] > target){
            search(arr, target, start, search_index-1);
        }
        if(arr[search_index] < target){
            search(arr, target, search_index+1,end);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        new BinarySearch().search(arr, 2, 0, arr.length-1);
    }
}
