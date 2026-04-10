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

class SearchInLL{
    public boolean searchKey(ListNode head, int key) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}