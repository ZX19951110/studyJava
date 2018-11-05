package ToOffer;

public class FindKthToTail {
    //输入一个链表，输出该链表中倒数第k个结点。
    ListNode find(ListNode head, int k){
        ListNode p = head;
        int count = 0;
        while (p != null){
            count++;
            p = p.next;
        }
        p = head;
        int pre_order = count - k + 1;
        for(int i = 0; i < pre_order - 1; i++){
            p = p.next;
        }
        return p;
    }
    public static void main(String[] args){
        ListNode head = ListNode.getList(3);
        System.out.println(new FindKthToTail().find(head, 2).value);
    }
}
