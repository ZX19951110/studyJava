import java.util.*;
public class RomaNumber {
    static String res = "";
    static int get_m(int number){
        int last_1 = number % 1000;
        int m_num = number / 1000;
        for (int i = 0; i < m_num; i++){
            res += "M";
        }
        return last_1;
    }
    static int get_c(int number){
        int last_2 = number  % 100;
        int c_num = number / 100;
        for (int i =0; i < c_num; i++){
            res += "C";
        }
        return last_2;
    }
    static int get_x(int number){
        int last_3 = number % 10;
        int x_num = number / 10;
        for (int i = 0; i < x_num; i++){
            res += "X";
        }
        return last_3;
    }
    static void get_final(int number){
        if (number >= 5 && number != 9){
            String temp = "V";
            for(int i = 0; i < number - 5; i ++){
                temp += "I";
            }
            res += temp;
        }
        else if (number == 9){
            res += "IX";
        }
        else {
            String temp = "";
            if(number <= 3){
                for (int i = 0; i < number; i++){
                    temp += "I";
                }
            }
            else {
                temp = "IV";
            }
            res += temp;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 1000){
            int res1 = get_m(number);
            if(res1 >= 500){
                res1 -= 500;
                res += "D";
            }
            if(res1 >= 100){
                int res2 = get_c(res1);
                if(res2 > 50){
                    res2 -= 50;
                    res += "L";
                }
                int res3 = get_x(res2);
                get_final(res3);
            }
            else{
                if(res1 > 50){
                    res1 -= 50;
                    res += "L";
                }
                int res3 = get_x(res1);
                get_final(res3);
            }
        }
        else if(number >= 100){
            if(number >= 500){
                number -= 500;
                res += "D";
            }
            int res2 = get_c(number);
            if(res2 > 50){
                res2 -= 50;
                res += "L";
            }
            int res3 = get_x(res2);
            get_final(res3);
        }
        else{
            if(number > 50){
                number -= 50;
                res += "L";
            }
            int res3 = get_x(number);
            get_final(res3);
        }
        System.out.println(res);
    }
}