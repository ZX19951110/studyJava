import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        do {
            String string = scan.nextLine();
            System.out.println(string);
            if (string.equals("")) {
                break;
            }
        } while (true);
    }
}
