import java.util.HashSet;
import java.util.Iterator;

public class HashSetimplementation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);

        System.out.println(set);

        Iterator it= set.iterator();

        System.out.println("--Iteration---");
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("\n---Search----");
        if(set.contains(1)){
            System.out.println("1 is present in the Hashset");
        }

        if(!set.contains(5)){
            System.out.println("is not present in the Hashset");
        }else{
            System.out.println("is present");
        }

        System.out.println("\n---Remove---");
        set.remove(3);

        System.out.println(set);
    }
}
