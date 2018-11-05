package ToOffer;

import java.util.Stack;

public class ReverseList {
    //输入一个链表，反转链表后，输出新链表的表头。
    ListNode reverse(ListNode head){
        Stack<ListNode> s = new Stack<>();
        ListNode p = head;
        while (p != null){
            ListNode q = p;
            p = p.next;
            q.next = null;
            s.push(q);
        }
        ListNode res = s.pop();
        p = res;
        while (!s.empty()){
            p.next = s.pop();
            p = p.next;
        }
        return res;
    }
    public static void main(String[] args){
        ListNode head = new ReverseList().reverse(ListNode.getList(3));
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
