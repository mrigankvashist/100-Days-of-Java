// Brute Force - T = O(N) + O(N) [Traversal + finding] S= O[1]
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if (head == null) { // IF head is null, => linkedlist is blank therefore returing 0
//             return null;
//         }
//         int cnt = 0; // init count

//         // Finding length of linked list :-
//         ListNode temp = head; // init new temporary node as the head
//         while (temp != null) { // traversing through the linked list and incrementing count to find the length
//                                // of the linked list
//             cnt++;
//             temp = temp.next;
//         }
//         cnt = cnt - n; // since n is a number from the end in the linked list, therefore to find the
//                        // distance from head, we subtract n from total length

//         // edge case: deleting the first node
//         if (cnt == 0) { // if cnt = 0 implies that the head node is to be deleted ( cnt - n, where n in
//                         // the question is stated as the linked list length)
//             return head.next;
//         }

//         // deleting other that first node
//         int i = 0; // variable to compare with the count value
//         temp = head; // temp re-initialised as the head value
//         while (temp != null) { // traversing through the linked list
//             i++; // incrementing i so that whenever we reach the desired node, we can skip the
//                  // link
//             if (i == cnt) {
//                 temp.next = temp.next.next; // temp.next skips the next link for the desried node
//             }
//             temp = temp.next;
//         }

//         return head;

//     }
// }
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

// optimised--> T = O(N), S=O(1)
public class removenth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(); // new start node initialised
        start.next = head; // putting start next as head node
        ListNode slow = start; // slow pointer init
        ListNode fast = start; // fast pointer init
        for (int i = 1; i <= n; ++i) { // traversing the fast pointer from head till the nth node from the beginning
            fast = fast.next;
        }
        while (fast.next != null) {  // while faster pointer doesnt reaches null, increment fast and slow pointer by one
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;  // as fast pointer reaches null, skip the slow pointer's next node
        return start.next;  

    }
}
