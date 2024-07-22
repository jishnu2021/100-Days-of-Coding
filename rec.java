// public class rec {
//     public static void main(String[] args) {
//          String s="baccadaabsabhsa";
//          String ans=check(s,0);
//          System.out.println(ans);
//     }

//     private static String check(String s,int i) {
//        if(i>=s.length()){
//         return "";
//        }

//        char ch=s.charAt(i);

//        if(ch=='a'){
//         return check(s, i+1);
//        }
//        return ch+check(s,i+1);

       
//     }
// }

// public class rec {
//     public static void main(String[] args) {
//         String s = "baccad";
//         String ans = check(s);
//         System.out.println(ans);
//     }

//     private static String check(String s) {
//         if (s.isEmpty()) {
//             return "";
//         }

//         char ch = s.charAt(0);

//         if (ch == 'a') {
//             return check(s.substring(1));
//         }
//         return ch + check(s.substring(1));

//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * rec
 */
public class rec {

    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=checkduplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }

    static List<List<Integer>> checkduplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n =outer.size();
            for(int j =start;j<n;j++){
                List<Integer> interval = new ArrayList<>(outer.get(j));
                interval.add(arr[i]);
                outer.add(interval);
            }
        }


        return outer;
    }
}
