package ToOffer;

public class ListNode {
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
    static ListNode getList(int num){
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i <= num; i++){
            p.next = new ListNode(i);
            p = p.next;
        }
        return head;
    }
}
