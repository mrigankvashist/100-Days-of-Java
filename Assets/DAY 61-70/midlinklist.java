class Node 
        { 
        public
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };



// as fast moves = 2* slow moves, therefore when fast ptr will finish the link list, slow will be at n/2
public class midlinklist {
    public static Node findMiddle(Node head){
        Node slow = head,fast = head;  // tortoise method
        while(fast!=null &&  fast.next!=null){
            slow = slow.next; // slow moves by 1 space
            fast = fast.next.next; // fast moves  by 2 spaces
        }
        return slow;
    }
    
}
