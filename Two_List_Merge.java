import java.util.Scanner;

class node {
    node(int value){
        this.value = value;
    }
    int value;
    node next;
}
public class Two_List_Merge{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        node p = new node(-1);
        node q = new node(-1);
        node pt = p;
        node qt = q;
        for (int i = 0; i< x; i++){
            pt.next = new node(sc.nextInt());
            pt = pt.next;
        }
        for (int j = 0; j < y;j++){
            qt.next = new node(sc.nextInt());
            qt = qt.next;
        }
        p = p.next;
        q = q.next;
        node head = new node(-1);
        node temp = head;
        while (p != null && q != null){
            if (p.value <= q.value){
                temp.next = p;
                p = p.next;
            }
            else {
                temp.next = q;
                q = q.next;
            }
            temp = temp.next;
        }
        if (q != null){
            temp.next = q;
        }
        else if(p != null){
            temp.next = p;
        }
        node a = head.next;
        String output = "";
        while (a!=null){
            output = output + a.value + "->";
            a = a.next;
        }
        System.out.println(output.substring(0,output.length()-2));
    }
}