import java.util.List;
import java.util.ArrayList;
public class ListTailToHead {
    public static void main(String[] args){
        ListNode head = ListNode.getList(5);
        ListNode p = head;
        ListNode q = head.next;
        List<Integer> list = new ArrayList<>();
        while (head.next!=null){
            p = head;
            q = head.next;
            while (q.next != null){
                p = p.next;
                q = q.next;
            }
            list.add(q.value);
            p.next = null;
        }
        list.add(p.value);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
