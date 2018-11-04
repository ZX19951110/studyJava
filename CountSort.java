public class CountSort {
    void sort(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i:arr){
            if (max < i) max = i;
            if (min > i) min = i;
        }
        int count = max - min + 1;
        int[] nums = new int[count];
        int[] counts = new int[count];
        for (int i = 0; i < count; i++){
            nums[i] = min;
            min++;
        }
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < count; j++){
                if(nums[j] == arr[i]){
                    counts[j]++;
                    break;
                }
            }
        }
        int res_index = 0;
        for (int i = 0; i < count; i++){
            if(counts[i] != 0){
                for (int j = 0; j < counts[i]; j++){
                    arr[res_index] = nums[i];
                    res_index++;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] testArr = {1, 2, 3, 5, 9, 4, 6, 7, 0, 8};
        new CountSort().sort(testArr);
        for(int i : testArr){
            System.out.println(i);
        }
    }
}
