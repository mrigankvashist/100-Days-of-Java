
 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

public class reverselinklist {
    public ListNode reverseList(ListNode head){
        ListNode dummy = null;  // dummy array initially at the beginning of the linked list
        while(head !=null){  // while head will not reach the end of link  list
            ListNode next = head.next;  // creating ptr bw head and its next element
            // initial order------   dummy     head ------> next

            head.next = dummy; // breaking ptr b/w head->next . now the head-> points to dummy, which is present at the beginning(left side of the head)
            // order -------   dummy <------head      next

            dummy = head; // moving the dummy one space ahead, to head
            head = next; // moving head one space ahead, to next
            //order -----  null <----- head <-----  next
        }
        return dummy;
        
    }
    
}
