public class ListOperations {
    static void recoder_list(ListNode head){
        ListNode start = head;
        if (head == null){
            System.out.println("{}");
            return;
        }
        while (start.next != null && start.next.next != null){
            ListNode p = start;
            while (p.next.next != null){
                p = p.next;
            }
            p.next.next = start.next;
            start.next = p.next;
            p.next = null;
            start = start.next.next;
        }
        String res = "{";
        while (head.next != null){
            res += head.value;
            res += ",";
            head = head.next;
        }
        res += head.value + "}";
        System.out.println(res);
    }
    static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        int i = 0;
        while (fast != null) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                //
                isCycle = true;
                break;
            }
        }
        slow = head;
        if (isCycle) {
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;//相遇后将fast步长改为1，再次相遇为环入口
            }
        } else {
            return null;// 没有环
        }
        return fast;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode p = head;
        for(int i = 1; i <= 4; i++){
            p.next = new ListNode(i);
            p = p.next;
        }
        recoder_list(head);
    }
}
