import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("India",120);
        map.put("USA",30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China",149);
        map.put("Pakistan", 80);

        System.out.println(map);

        //search

        if(map.containsKey("China")){
            System.out.println("China is present in the map");
        }else{
            System.out.println("China is not present in the map");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("bangladesh"));

        //Interator
        int arr[]={12,13,45};

        for(int val:arr){
            System.out.println(val);
        }

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("Pakistan");
        System.out.println(map);

    }
}
