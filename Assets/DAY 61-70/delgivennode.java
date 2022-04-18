  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    public ListNode() {
    }
 }
    
   public class delgivennode {
       public void deleteNode(ListNode node) {
         // we are not actually deleting a node since we dont have head, we are copying the next node's value to the node to be removed
           node.val = node.next.val; // copying the next node's value to the node to be removed
           node.next = node.next.next; // linking the node to the next's next node
   
       }
   }
