import java.util.LinkedList;

class LL{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        System.out.println(list);

        list.addLast("5");
        list.addLast("6");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        // list.removeFirst();
        // list.removeLast();
        System.out.println(list);
    }
}
