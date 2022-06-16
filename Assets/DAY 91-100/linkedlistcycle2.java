import java.util.HashSet;
class ListNode {
    int num;
    ListNode next;

    ListNode(int val) {
        num = val;
        next = null;
    }
}
public class linkedlistcycle2 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return head;
            }
            else set.add(head);
            head = head.next;
        }
        return null;       
    } 
}
