class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}

class InsertAtHead{
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        head = newNode;

        return head;
    }
}