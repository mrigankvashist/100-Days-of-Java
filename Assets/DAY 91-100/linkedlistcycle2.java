//import java.util.HashSet;
class ListNode {
    int num;
    ListNode next;

    ListNode(int val) {
        num = val;
        next = null;
    }
}

//T=S=O(N) 

// public class linkedlistcycle2 {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> set = new HashSet<>();
//         while(head!=null){
//             if(set.contains(head)){
//                 return head;
//             }
//             else set.add(head);
//             head = head.next;
//         }
//         return null;       
//     } 
// }


//T=O(N) S=O(1)
public class linkedlistcycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){  // if head == null or head next = null then return null cz no cycle
            return null;
        } 
        // tortoise methos
        ListNode slow = head;  
        ListNode fast = head;
        ListNode start = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow!=start){
                    start = start.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
        
        
    }
}
