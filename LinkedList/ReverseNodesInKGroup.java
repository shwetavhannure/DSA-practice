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

class ReverseNodesInKGroup{
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode = null;
        ListNode prevNode = null;

        while(temp != null){
            ListNode kthNode = findkthNode(temp, k);

            if(kthNode == null){
                if(prevNode != null){
                   prevNode.next = temp;
                }
               break;
            }

            nextNode = kthNode.next;
            kthNode.next = null;

            ListNode newHead = reverse(temp);

            if(temp == head){
                head = newHead;
            }
            else{
                prevNode.next = newHead;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode previous = null;

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = previous;
            previous = curr;
            curr = nextNode;
        }
        return previous;
    }


    private ListNode findkthNode(ListNode temp, int k){
        k--;

        while(temp != null && k >0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
}
