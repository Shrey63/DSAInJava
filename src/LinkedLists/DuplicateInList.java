package LinkedLists;

class MyNode {
    int val;
    MyNode next;

    public MyNode() {
    }

    public MyNode(int val) {
        this.val = val;
    }

    public MyNode(int val, MyNode next) {
        this.val = val;
        this.next = next;
    }
}

class Duplicate {
    public static MyNode deleteDuplicates(MyNode head) {
        if (head == null)
            return head;

        MyNode temp = head.next;
        MyNode prev = head;
        while (temp != null) {
            if (prev.val == temp.val)
                prev.next = temp.next;
            else
                prev = prev.next;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Create the linked list with duplicate elements
        MyNode node1 = new MyNode(1);
        MyNode node2 = new MyNode(2);
        MyNode node3 = new MyNode(2);
        MyNode node4 = new MyNode(3);
        MyNode node5 = new MyNode(3);
        MyNode node6 = new MyNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // Call deleteDuplicates to remove duplicates
        MyNode result = deleteDuplicates(node1);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
