public class CloneLinkedListed {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public static Node CloneList(Node head){
        if(head == null){
            return null;
        }

        Node clonehead = new Node(head.val);
        Node temp = head.next;
        Node curr = clonehead;

        while( temp != null){
            curr.next = new Node(temp.val);
            temp = temp.next;
            curr = curr.next;
        }

        return clonehead;
    }

    public static void printList(Node head){
        Node temp = head;

        if(temp == null){
            return;
        }

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(8);
        head.next.next = new Node(9);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(10);

        System.out.println("The Linkedlist looked like: ");
        printList(head);

        System.out.println();
        Node clonehead = CloneList(head);
        System.err.println("The Cloned List is :");
        printList(clonehead);
    }
}