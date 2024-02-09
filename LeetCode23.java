
import java.util.List;
import java.util.ArrayList;

public class LeetCode23 {
    public static void main(String[] args) {
        
        List<String> ans=new ArrayList<String>();
        ans.add("1");
        ans.add("4");
        ans.add("5");

        List<String> list2=new ArrayList<String>();
        list2.add("1");
        list2.add("3");
        list2.add("4");

        List<String> list3=new ArrayList<String>();
        list3.add("2");
        list3.add("5");
        list3.add("6");

        List<String> combinedlist=new ArrayList<String>();
        combinedlist.addAll(ans);
        combinedlist.addAll(list2);
        combinedlist.addAll(list3);

        combinedlist.sort(null);
        System.out.println(combinedlist);

    }
}
