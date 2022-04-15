public class addnumll {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); 
        ListNode temp = dummy;  // temporary linked list pointing to dummy node which is 0
        int carry = 0; // carry initialised as 0
        while( l1 != null || l2 != null || carry == 1) { // while list value of 1st and 2nd list is non zero and carry contains a value, the iterations will continue
            int sum = 0;  // sum for each iteration will be zero at the beginning
            if(l1 != null) { // if list 1 value is non zero, val is added to the sum
                sum += l1.val; 
                l1 = l1.next; 
            }
            
            if(l2 != null) { // if list 2 value is non zero, val is added to the sum
                sum += l2.val; 
                l2 = l2.next; 
            }
            
            sum += carry; // previous carry is added to the sum
            carry = sum / 10; // carry found by dividing the sum by 10
            ListNode node = new ListNode(sum % 10);  // new node of the summed list, modulus taken for numbers greater than 10, tens digit passed as carry for the next sum
            temp.next = node;  // temp node points to the summed list
            temp = temp.next; 
        }
        return dummy.next; // dummy.next is the head of summed list
    }
}
