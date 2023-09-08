/**
 * LinkedList
 */
 class LinkedList {

    private int size;

    LinkedList(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    Node head;
    // add - first,last
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head == null ){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // add -last
    public void addlast( String data){
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

    public void printList(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    // Delete - first

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deletelast(){
       if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }
        
        Node pre=null;
        Node temp=head;
        while(temp.next != null){
            pre=temp;
            temp=temp.next;
        }
        pre.next=null;
    }

    public int getsize(){
        return size;
    }



public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.addfirst("1");
    list.addfirst("2");
    list.addfirst("3");
    list.addfirst("4");
    list.addfirst("5");
    

    list.addlast("8");
    list.addlast("9");

    list.deletelast();
    list.deleteFirst();
    System.out.println(list.getsize());
    list.printList();

}    
}
