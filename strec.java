// public class strec {
//     public static void main(String[] args) {
//         String str="abc";
//         subseq("",str);
//     }

//     private static void subseq(String p,String s) {
//        if(s.isEmpty()){
//         System.out.println(p);
//         return;
//        }

//        char ch=s.charAt(0);

//        subseq(p+ch, s.substring(1));
//        subseq(p, s.substring(1));
       
//     }

// }


//Now this is  added into arraylist how can i do it?

// import java.util.ArrayList;

// public class strec {
//     public static void main(String[] args) {
//         String str="abc";
//         System.out.println(subseq("",str));
//     }

//     private static ArrayList<String> subseq(String p,String s) {
//        if(s.isEmpty()){
//         ArrayList<String> list = new ArrayList<>();
//         list.add(p);
//         return list;
//        }

//        char ch=s.charAt(0);

//        ArrayList<String> left=subseq(p+ch, s.substring(1));
//        ArrayList<String> right=subseq(p, s.substring(1));
       
//        left.addAll(right);

//        return left;
//     }

// }


/**
 * strec
 */
// public class strec {

//     public static void main(String[] args) {
//         String s = "babcccad";
//         System.out.println(check(s,0));
//     }

//     private static String check(String s, int i) {
//         if(i>=s.length()){
//             return "";
//         }

//         char ch=s.charAt(i);

//         if(ch=='a'){
//             return check(s, i+1);
//         }else{
//             return ch+check(s, i+1);
//         }
//     }
// }


import java.util.ArrayList;
import java.util.List;
/**
 * strec
 */
public class strec {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> interval=new ArrayList<>(outer.get(i));
                interval.add(num);
                outer.add(interval);
            }
        }

        return outer;
    }
}