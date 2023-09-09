class LinkPalin{

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    
    public Node reverse(Node head){
        Node pre=null;
        Node current=head;
        Node nextNode=head;

        while(nextNode != null){
            nextNode=nextNode.next;
            current.next=pre;
            pre=current;
            current=nextNode;
        }

        return pre;
    }

    public Node findMiddle(Node head){
        Node h=head;
        Node T=head;

        while(h.next != null && h.next.next != null){
            h=h.next.next;
            T=T.next;

        }

        return T;
    }

    public void add(String data){
        Node newNode=new Node(data);
        if(head == null ){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        
    }

    public void print(){
        Node temp;
        temp=head;
        if(head==null){
            return;
        }
        while(temp.next != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public boolean palin(Node head){
        if(head==null || head.next==null){
            return true;
        }

        Node middle=findMiddle(head); //1st half ka end
        Node second=reverse(middle.next);

        Node firsthalf=head;

        while(second != null){
           if(firsthalf.data != second.data){
            return false;
           }
           firsthalf=firsthalf.next;
           second=second.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkPalin list=new LinkPalin();
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("5");
        list.add("4");

        // list.print();
        boolean ispalin=list.palin(list.head);

        System.out.println(ispalin);

    }
}