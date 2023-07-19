package LinkedLists;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class HasCycle {
    public static void main(String[] args) {
        // Create a linked list with a cycle
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // Create a cycle by connecting the last node to the second node

        // Check if the linked list has a cycle
        HasCycle hasCycleObj = new HasCycle();
        boolean hasCycle = hasCycleObj.hasCycle(node1);
        System.out.println("Has cycle: " + hasCycle);

        // Find the length of the cycle in the linked list
        int cycleLength = hasCycleObj.hasCycleLength(node1);
        System.out.println("Cycle length: " + cycleLength);
    }



    // Function to check if a linked list has a cycle
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                return true;
            }
        }

        // No cycle found
        return false;
    }

    // Function to find the length of the cycle in a linked list
    public int hasCycleLength(Node head) {
        if (head == null || head.next == null)
            return 0;

        Node fast = head;
        Node slow = head;
        int x = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                x = 1;
                break;
            }
        }

        if (x == 1) {
            int count = 1;
            slow = slow.next;

            while (slow != fast) {
                count++;
                slow = slow.next;
            }

            return count;
        } else {
            // No cycle found
            return 0;
        }
    }
}
