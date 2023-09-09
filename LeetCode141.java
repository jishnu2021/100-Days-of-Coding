class Solution{

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
            this.next=next;
        }
    }

    ListNode head;

    public boolean hashCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode hare=head;
        ListNode tur=head;

        while(hare != null && hare.next!=null){
            hare =hare.next.next;
            tur=tur.next;

            if(hare==tur){
                return true;
            }
        }
        return false;
    }

    public void add(int val){
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=newnode;
            return;
        }

        ListNode temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void main(String[] args) {
        Solution list =new Solution();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

    }
}