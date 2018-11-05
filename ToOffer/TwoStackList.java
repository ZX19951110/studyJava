package ToOffer;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Stack;

public class TwoStackList {
    static Stack<Integer> s1 = new Stack<>();
    static  {
        for (int i = 1; i <= 5; i++ ){
            s1.push(i);
        }
    }
    static Stack<Integer> s2 = new Stack<>();
    static Integer pop(){
        return s1.pop();
    }
    static void push(int num){
        s1.push(num);
    }
    static void shift(int num){
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        s2.push(num);
        while (!s2.empty()){
            s1.push(s2.pop());
        }
    }
    static Integer unshift(){
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        return res;
    }
    public static void main(String[] args){
        while (!s1.empty()){
            System.out.println(s1.pop());
        }
    }
}
