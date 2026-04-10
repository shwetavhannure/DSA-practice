class ListNode {
    int val;
    ListNode next;

    ListNode() {
        this.val = 0;
        this.next = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LengthOfLL {
    public int getLength(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}