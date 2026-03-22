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

class RotateList{
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        int length = 1;
        ListNode tail = head;

        while(tail.next != null){
            length++;
            tail = tail.next;
        }

        if(k % length == 0) return head;

        k = k % length;

        tail.next = head;
        ListNode newLastNode = findNthNode(head, length-k);

        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }


    private ListNode findNthNode(ListNode head, int n){
       ListNode temp = head;
       for(int i = 1; i < n; i++){
        temp = temp.next;
       }
       return temp;
    }
}
