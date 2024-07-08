public class leetcode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
    public static boolean canConstruct(String r, String m) {
       
       if(r == null || m==null){
        return false;
       }
        int i=0;
        int j=0;
        while(i<r.length() && j<m.length()){
            if(r.charAt(i) != m.charAt(j)){
                return false;
            }else{
               i++; 
               j++; 
            }
        }
    return true;
  }
}
