
import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();


        // Insert
        map.put("Jishnu", 100);
        map.put("Srijeet", 95);
        map.put("Arijit", 90);
        map.put("jeet", 85);
        map.put("Samya", 80);
        map.put("Rezo", 75);

        System.out.println(map);

        // search
        if(map.containsKey("Rezo")){
            System.out.println("is present");
        }

        if(map.containsKey("Archis")){
            System.out.println("is present");
        }else{
            System.out.println("not presnet");
        }



        System.out.println(map.get("Srijeet"));
        System.out.println(map.get("Datta"));


        for(Map.Entry<String,Integer> val : map.entrySet()){
            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }

    }
}
