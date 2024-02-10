// public class permutaion {
//     public static void main(String[] args) {
//         permu("","abc");
//     }

//     private static void permu(String p, String u) {
//        if(u.isEmpty()){
//         System.out.println(p);
//         return;
//        }

//        char ch=u.charAt(0);
//        for(int i=0;i<=p.length();i++){
//         String f=p.substring(0, i);
//         String s = p.substring(i, p.length());
//         permu(f+ch+s, u.substring(1));
//        }
//     }
// }

// import java.util.ArrayList;

// public class permutaion {
//     public static void main(String[] args) {
//         ArrayList<String> ans = permu("", "abc");
//         System.out.println(ans);
//     }

//     private static ArrayList<String> permu(String p, String u) {
//         if (u.isEmpty()) {
//             ArrayList<String> list=new ArrayList<>();
//             list.add(p);
//             return list;
//         }
//         char ch = u.charAt(0); 
//         ArrayList<String> ans = new ArrayList<>();
        
//         for (int i = 0; i <= p.length(); i++) {
//             String f = p.substring(0, i);
//             String s = p.substring(i, p.length());
//             ans.addAll(permu(f + ch + s, u.substring(1)));
//         }

//         return ans;
//     }

// }


public class permutaion {
    public static void main(String[] args) {
        int ans=permu("", "abc");
        System.out.println(ans);
    }

    private static int permu(String p, String u) {
        if (u.isEmpty()) {
        return 1;
        }
        int c=0;
        char ch = u.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            c=c+permu(f + ch + s, u.substring(1));
        }
        return c;
    }
}