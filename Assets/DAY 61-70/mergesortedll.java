// Brute Force : T = O(n1+n2), S = O(n1+n2)

 // Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//        ListNode dummy = new ListNode(); // creating a dummy node
//        ListNode duplicatedummy  = dummy; // creating a duplicate dummy node so as to change the values of the dummy node
//         while(list1!=null && list2!=null){
//             if(list1.val<list2.val){  // if value of list 1 is smaller, we add its value to a new node  (since the next value in the linked list would be smaller of the two bigger values)
//                 duplicatedummy.next = new ListNode(list1.val);
//                 list1 = list1.next; // link formed to the next element of l1
//             }
//             else{
//                 duplicatedummy.next = new ListNode(list2.val); // if value of list 2 is smaller, we add its value to a new node
//                 list2 = list2.next;
//             }
//             duplicatedummy = duplicatedummy.next;  // duplicate link is formed with the next duplicatedummy node
//         }
//         if(list1==null){  // if the value is null, the other list values are pointed in the duplicatedummy
//             duplicatedummy.next = list2;
//         }
//         if(list2==null){
//             duplicatedummy.next = list1;
//         }
//         return dummy.next;    
//     }
// }

// optimised technique --> Inplace technique, by breaking links
// T = O(n1+n2), S = O(1)
public class mergesortedll{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1== null){  // if l1 is null linked list we return l2
            return list2;
        }   
        if(list2 == null){ // if l2 is null linked list we return l1
            return list1;
        }
        if(list1.val>list2.val){  // if value of list1 is greater than value of list2, we swap the two, since we place result at l1, which has to contain the smaller value of the two linked list (since the next value in the linked list would be smaller of the two bigger values)
            ListNode temp = list1; // swapping l1 and l2 using a temp variable
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;  // assinging result at list 1 --> the smaller value of the two linked list
        while(list1 !=null && list2!=null){  // while neither of them is null
            ListNode tmp = null;
            while(list1 !=null && list1.val <=list2.val ){  // while all values of list 1 are less than list 2, we keep assinging temporary node to value of l1 and forming link with the next l1 element
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2; // as the value of l1 becomes greater than l2, the temp link points towards list2 (smaller) value

            //swap 
            ListNode temp = list1;  // as l1>l2, we swap the values
            list1 = list2;
            list2 = temp;

        }
        return res; // returning result
     }

}