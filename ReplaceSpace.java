import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ReplaceSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        String string = sc.nextLine();
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                list.add('%');
                list.add('2');
                list.add('0');
                continue;
            }
            list.add(string.charAt(i));
        }
        String output = "";
        for(int i = 0; i < list.size(); i++){
            output+=list.get(i);
        }
        System.out.println(output);
    }
}
