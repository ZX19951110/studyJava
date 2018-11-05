package ToOffer;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MergeTwoList {
    /*输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。*/
    ListNode merge(ListNode p, ListNode q){
        ListNode head = new ListNode(-1);
        ListNode i = head;
        while (p != null && q != null){
            if(p.value >= q.value){
                i.next = q;
                q = q.next;
                i = i.next;
            }
            else{
                i.next = p;
                p = p.next;
                i = i.next;
            }
        }
        if(p == null){
            i.next = q;
        }
        if(q == null){
            i.next = p;
        }
        return head.next;
    }
    public static void main(String[] args){
        ListNode head = new MergeTwoList().merge(ListNode.getList(3),ListNode.getList(8));
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
