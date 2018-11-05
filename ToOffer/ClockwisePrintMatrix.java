package ToOffer;

public class ClockwisePrintMatrix {
    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
    void print(int[][] matrix){
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int count = 0;
        int size = matrix[0].length * matrix.length;
        while ((top <= bottom || left <= right) && count < size){
            if((top <= bottom || left <= right) && count < size){
                for(int i = left; i <= right; i++){
                    System.out.println(matrix[top][i]);
                    count++;
                }
                top++;
            }
            if((top <= bottom || left <= right) && count < size){
                for (int i = top; i <= bottom; i++){
                    System.out.println(matrix[i][right]);
                    count++;
                }
                right--;
            }
            if((top <= bottom || left <= right) && count < size){
                for (int i = right; i >= left; i--){
                    System.out.println(matrix[bottom][i]);
                    count++;
                }
                bottom--;
            }
            if((top <= bottom || left <= right) && count < size){
                for (int i = bottom; i >= top; i--){
                    System.out.println(matrix[i][left]);
                    count++;
                }
                left++;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        new ClockwisePrintMatrix().print(matrix);
    }
}