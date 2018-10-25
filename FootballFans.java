import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class FootballFans {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        String[] lines = new String[m];
        for (int i = 0; i < m; i++){
            lines[i] = scanner.next();
        }
            for (int i = 0; i < m; i++) {
                String[] ints = lines[i].split(",");
                for (int j =0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(ints[j]);
                }
            }
        for (int[] i:arr){
            for (int j:i){
                System.out.println(j);
            }
        }
    }
}
