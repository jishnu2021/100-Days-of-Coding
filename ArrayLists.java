import java.util.ArrayList;

import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add elements
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(35);
        list.add(70);
        System.out.println(list);

        // int element=list.get(0);
        // System.out.println(element);

        // Between addition
        list.add(1,7);
        System.out.println(list);

        // // set element
        // list.set(1, 9);
        // System.out.println(list);

        // // delete
        // list.remove(2);
        // System.out.println(list);

        // int size=list.size();
        // System.out.println(size);

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));

        //     System.out.println(list);
            // collections for sort
        // }
           Collections.sort(list); 
           System.out.println(list);
    
    }
}
