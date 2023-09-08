class Link {
   static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    public ListNode nthDelete(ListNode head, int n) {
        if(head.next==null){
            return null;
        }

        int size=0;
        ListNode curr=head;
        while(curr != null){
            curr=curr.next;
            size++;
        }

        if(n==size){
           return head.next;
        }

        int indexSearch=size-n;
        ListNode pre=head;
        int i=1;
        while(i<indexSearch){
            pre=pre.next;
            i++;
        }
        pre.next=pre.next.next;
        return head;

    }

    public void printList(){
        if(head==null){
            return;
        }
        ListNode temp=head;
        while(temp.next != null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print(temp.val);
    }

    public static void main(String[] args) {
        Link list = new Link();

        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);
        list.printList();

        int n=2;
        System.out.println("\nAfter Delete");
        list.head=list.nthDelete(list.head, n);
        list.printList();
        
        // Add nodes to the list and perform operations as needed.
    }
}
