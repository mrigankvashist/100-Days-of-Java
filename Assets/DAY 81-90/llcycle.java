
class Node {
    int num;
    Node next;

    Node(int val) {
        num = val;
        next = null;
    }
}

public class llcycle {
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    // utility function to create cycle
    static void createCycle(Node head, int a, int b) {
        int cnta = 0, cntb = 0;
        Node p1 = head;
        Node p2 = head;
        while (cnta != a || cntb != b) {
            if (cnta != a) {
                p1 = p1.next;
                ++cnta;
            }
            if (cntb != b) {
                p2 = p2.next;
                ++cntb;
            }
        }
        p2.next = p1;
    }
    // !!!!!!!!!!!!!!!!!########### ANSWER IS FROM HERE
    // #################!!!!!!!!!!!!!!!!
    // Brute force : T= O(N) S=O(N)
    // utility function to detect cycle
    // static boolean cycleDetect(Node head) {
    // Node temp = head;
    // HashSet<Node> set = new HashSet<Node>();
    // if(temp == null || temp.next == null){
    // return false;
    // }
    // while(temp!=null){
    // if(set.contains(temp)){
    // return true;
    // }
    // else set.add(temp);
    // temp = temp.next;
    // }
    // return false;
    // }

    // Optimised T= O(N) S=O(1)
    static boolean cycleDetect(Node head) {
        Node slow = head;
        Node fast = head;
        if (head == null || head.next == null) {
            return false;
        }
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        createCycle(head, 1, 3);// creating cycle in the list
        if (cycleDetect(head) == true)
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");

    }
}
