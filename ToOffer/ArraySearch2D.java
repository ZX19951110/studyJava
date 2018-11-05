package ToOffer;
import java.util.*;
public class ArraySearch2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[][] arr_2d = {{1,2,3},{4,5,6}};
        int col = arr_2d[0].length - 1;
        int row = 0;
        while (row <= arr_2d.length - 1 && col >= 0){
            if(target > arr_2d[row][col]){
                row++;
                continue;
            }
            if(target < arr_2d[row][col]){
                col--;
                continue;
            }
            if(row == arr_2d.length-1 && col == 0 && arr_2d[row][col] != target){
                break;
            }
            if(target == arr_2d[row][col]) {
                System.out.println(row + ":" + col);
                return;
            }
        }
        System.out.println(-1);
    }
}
