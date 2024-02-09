// public class recstep {
//     public static void main(String[] args) {
//         leetprob("","12");
//     }

//     private static void leetprob(String p,String u) {
//         if(u.isEmpty()){
//             System.out.println(p);
//             return;
//         }

//         int digit=u.charAt(0)-'0';
        
//         for(int i=(digit-1)*3;i<digit*3;i++){
//             char ch=(char)('a'+i);
//             leetprob(p+ch, u.substring(1));
//         }
//     }
// }

// import java.util.ArrayList;

// public class recstep {
//     public static void main(String[] args) {
//         System.out.println(leetprob("","12"));
//     }

//     private static ArrayList<String> leetprob(String p,String u) {
//         if(u.isEmpty()){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//         }

//         int digit=u.charAt(0)-'0';

//         ArrayList<String> list=new ArrayList<>();

//         for(int i=(digit-1)*3;i<digit*3;i++){
//             char ch=(char)('a'+i);
//             list.addAll(leetprob(p+ch, u.substring(1)));
//         }
//         return list;
//     }
// }

public class recstep {
    public static void main(String[] args) {
        System.out.println(leetprob("","12"));
    }

    private static int leetprob(String p,String u) {
        if(u.isEmpty()){
    
            return 1;
        }

        int digit=u.charAt(0)-'0';
        int c=0;
        
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            c=c+leetprob(p+ch, u.substring(1));
        }
        return c;
    }
}
